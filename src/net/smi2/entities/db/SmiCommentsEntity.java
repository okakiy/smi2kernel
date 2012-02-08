package net.smi2.entities.db;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: Oleg Konstantinov
 * Date: 02.02.12
 * Time: 13:36
 */
@javax.persistence.Table(name = "smi_comments", schema = "", catalog = "smi20")
@Entity
public class SmiCommentsEntity {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Timestamp dt;

    @javax.persistence.Column(name = "dt")
    @Basic
    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }

    private String text;

    @javax.persistence.Column(name = "text")
    @Basic
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private int author;

    @javax.persistence.Column(name = "author")
    @Basic
    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    private int authorEid;

    @javax.persistence.Column(name = "author_eid")
    @Basic
    public int getAuthorEid() {
        return authorEid;
    }

    public void setAuthorEid(int authorEid) {
        this.authorEid = authorEid;
    }

    private int newsId;

    @javax.persistence.Column(name = "news_id")
    @Basic
    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    private int sub;

    @javax.persistence.Column(name = "sub")
    @Basic
    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    private int numsub;

    @javax.persistence.Column(name = "numsub")
    @Basic
    public int getNumsub() {
        return numsub;
    }

    public void setNumsub(int numsub) {
        this.numsub = numsub;
    }

    private int rating;

    @javax.persistence.Column(name = "rating")
    @Basic
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    private boolean getbyemail;

    @javax.persistence.Column(name = "getbyemail")
    @Basic
    public boolean isGetbyemail() {
        return getbyemail;
    }

    public void setGetbyemail(boolean getbyemail) {
        this.getbyemail = getbyemail;
    }

    private int replyTo;

    @javax.persistence.Column(name = "reply_to")
    @Basic
    public int getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(int replyTo) {
        this.replyTo = replyTo;
    }

    private int order;

    @javax.persistence.Column(name = "order")
    @Basic
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    private int level;

    @javax.persistence.Column(name = "level")
    @Basic
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    private byte ismoderate;

    @javax.persistence.Column(name = "ismoderate")
    @Basic
    public byte getIsmoderate() {
        return ismoderate;
    }

    public void setIsmoderate(byte ismoderate) {
        this.ismoderate = ismoderate;
    }

    private boolean ishidden;

    @javax.persistence.Column(name = "ishidden")
    @Basic
    public boolean isIshidden() {
        return ishidden;
    }

    public void setIshidden(boolean ishidden) {
        this.ishidden = ishidden;
    }

    private byte isDelete;

    @javax.persistence.Column(name = "is_delete")
    @Basic
    public byte getDelete() {
        return isDelete;
    }

    public void setDelete(byte delete) {
        isDelete = delete;
    }

    private boolean isEffected;

    @javax.persistence.Column(name = "is_effected")
    @Basic
    public boolean isEffected() {
        return isEffected;
    }

    public void setEffected(boolean effected) {
        isEffected = effected;
    }

    private String textClass;

    @javax.persistence.Column(name = "text_class")
    @Basic
    public String getTextClass() {
        return textClass;
    }

    public void setTextClass(String textClass) {
        this.textClass = textClass;
    }

    private boolean isexpert;

    @javax.persistence.Column(name = "isexpert")
    @Basic
    public boolean isIsexpert() {
        return isexpert;
    }

    public void setIsexpert(boolean isexpert) {
        this.isexpert = isexpert;
    }

    private String ip;

    @javax.persistence.Column(name = "ip")
    @Basic
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    private boolean isBattlefield;

    @javax.persistence.Column(name = "is_battlefield")
    @Basic
    public boolean isBattlefield() {
        return isBattlefield;
    }

    public void setBattlefield(boolean battlefield) {
        isBattlefield = battlefield;
    }

    private String city;

    @javax.persistence.Column(name = "city")
    @Basic
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private byte isExpert1;

    @javax.persistence.Column(name = "is_expert1")
    @Basic
    public byte getExpert1() {
        return isExpert1;
    }

    public void setExpert1(byte expert1) {
        isExpert1 = expert1;
    }

    private String language;

    @javax.persistence.Column(name = "language")
    @Basic
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmiCommentsEntity that = (SmiCommentsEntity) o;

        if (author != that.author) return false;
        if (authorEid != that.authorEid) return false;
        if (getbyemail != that.getbyemail) return false;
        if (id != that.id) return false;
        if (isBattlefield != that.isBattlefield) return false;
        if (isDelete != that.isDelete) return false;
        if (isEffected != that.isEffected) return false;
        if (isExpert1 != that.isExpert1) return false;
        if (isexpert != that.isexpert) return false;
        if (ishidden != that.ishidden) return false;
        if (ismoderate != that.ismoderate) return false;
        if (level != that.level) return false;
        if (newsId != that.newsId) return false;
        if (numsub != that.numsub) return false;
        if (order != that.order) return false;
        if (rating != that.rating) return false;
        if (replyTo != that.replyTo) return false;
        if (sub != that.sub) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (dt != null ? !dt.equals(that.dt) : that.dt != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (textClass != null ? !textClass.equals(that.textClass) : that.textClass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dt != null ? dt.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + author;
        result = 31 * result + authorEid;
        result = 31 * result + newsId;
        result = 31 * result + sub;
        result = 31 * result + numsub;
        result = 31 * result + rating;
        result = 31 * result + (getbyemail ? 1 : 0);
        result = 31 * result + replyTo;
        result = 31 * result + order;
        result = 31 * result + level;
        result = 31 * result + (int) ismoderate;
        result = 31 * result + (ishidden ? 1 : 0);
        result = 31 * result + (int) isDelete;
        result = 31 * result + (isEffected ? 1 : 0);
        result = 31 * result + (textClass != null ? textClass.hashCode() : 0);
        result = 31 * result + (isexpert ? 1 : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (isBattlefield ? 1 : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (int) isExpert1;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
