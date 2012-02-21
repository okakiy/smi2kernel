package net.smi2.kernel.controllers;

import net.smi2.entities.db.SmiNewsEntity;
import net.smi2.kernel.entities.NewsPool;
import net.smi2.kernel.entities.PoolManager;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;
import ru.yandex.lc.jbd.Dumper;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * @author ask
 */
@Controller
public class NewsController {

    @Autowired
    private PoolManager poolManager;

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final MappingJacksonJsonView view = new MappingJacksonJsonView();

    @RequestMapping("lastnews.json")
    public void lastNews(
            @RequestParam(value = "of", required = false, defaultValue = "0") int of,
            @RequestParam(value = "cnt", required = false, defaultValue = "10") int cnt,
            @RequestParam(value = "as", required = false, defaultValue = "JSON") String as,
            @RequestParam(value = "debug", required = false, defaultValue = "0") Byte debug,
            HttpServletResponse response
    ) throws IOException {
        NewsPool newsPool = poolManager.getNewsPool();
        List<SmiNewsEntity> news = newsPool.getNews(of, cnt );
        OutputStream os = response.getOutputStream();
        
        if ( as.equals("JSON") ) {
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            objectMapper.configure(SerializationConfig.Feature.DEFAULT_VIEW_INCLUSION, false);
            objectMapper.writerWithView(SmiNewsEntity.ShortView.class).writeValue(os, news);
        } else {
            response.setContentType("text/html");
            response.setCharacterEncoding("utf-8");
            String str;
            /*for (Smi2Entity element : news) {
                str = str + "\n" + element;
            }
            */
            Dumper dumper = new Dumper();
            str = "<pre>" + dumper.dump( news ) + "</pre>";
            os.write(str.getBytes());
        }

        os.flush();

        if ( debug == 1 ) {
            Runtime r = Runtime.getRuntime();
            long free = r.freeMemory() / 1048576;
            long used = r.totalMemory() / 1048576 - free;
            long max = r.maxMemory() / 1048576;
            System.out.printf("Memory used: %dM(%dM) free: %dM%n", used, max, free);
        }
    }
}
