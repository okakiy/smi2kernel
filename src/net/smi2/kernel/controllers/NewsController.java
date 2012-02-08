package net.smi2.kernel.controllers;

import net.smi2.entities.db.Smi2Entity;
import net.smi2.entities.db.SmiNewsEntity;
import net.smi2.kernel.entities.NewsPool;
import net.smi2.kernel.entities.PoolManager;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("lastnews.json")
    public void lastNews(
            @RequestParam(value = "of", required = false, defaultValue = "0") int of,
            @RequestParam(value = "cnt", required = false, defaultValue = "10") int cnt,
            @RequestParam(value = "as", required = false, defaultValue = "JSON") String as,
            HttpServletResponse response
    ) throws IOException {
        NewsPool newsPool = poolManager.getNewsPool();
        List<SmiNewsEntity> news = newsPool.getNews(of, cnt );
        OutputStream os = response.getOutputStream();
        
        ObjectMapper mapper = new ObjectMapper();
        if ( as.equals("JSON")) {
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            mapper.writeValue(os, news);
        } else {
            response.setContentType("text/html");
            response.setCharacterEncoding("utf-8");
            String str = "";
            for (Smi2Entity element : news) {
                str = str + "\n" + element;
            }
            os.write(str.getBytes());
        }

        os.flush();
        Runtime r = Runtime.getRuntime();
        long used = (r.totalMemory() - r.freeMemory())/1048576;
        long max = r.maxMemory()/1048576;

        System.out.printf("Memory: %dM(%dM)%n",used,max);
    }
}
