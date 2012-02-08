package net.smi2.kernel.entities;

import net.smi2.entities.db.SmiNewsEntity;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Oleg Konstantinov
 * Date: 01.02.12
 * Time: 15:35
 */
public class NewsPool {
    private final List<SmiNewsEntity> newslist = new ArrayList<SmiNewsEntity>();

    public NewsPool() {
        loadData();
    }

    public void loadData(){
        System.out.println("Getting news");

        List<SmiNewsEntity> news;
        //try {
            final Session session = new Configuration().configure().buildSessionFactory().openSession();
            news = session.createCriteria(SmiNewsEntity.class).addOrder(Order.desc("id")).setMaxResults(1000).list();
            session.close();
            System.out.println("total news: " + news.size());
            newslist.addAll(news);
        //} catch (HibernateException e) {
        //    System.out.println("Can't load data.");
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        //}

    }

    public List<SmiNewsEntity> getNews(int start, int limit) {
        int end = start+limit;
        return newslist.subList(  start, end > newslist.size() ? newslist.size() : end );
    }

    public List<SmiNewsEntity> getNewslist() {
        return newslist;
    }

    @Override
    public String toString() {
        return super.toString();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
