package net.smi2.kernel.entities;

import net.smi2.entities.db.Smi2Entity;

import java.util.List;

/**
 * @author ask
 */
public class NewsListJson {
    private List<Smi2Entity> news;

    public List<Smi2Entity> getNews() {
        return news;
    }

    public void setNews(List<Smi2Entity> news) {
        this.news = news;
    }
}
