package net.smi2.entities.db;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: Oleg Konstantinov
 * Date: 02.02.12
 * Time: 13:36
 */
@javax.persistence.Table(name = "smi_clients_additional", schema = "", catalog = "smi20")
@Entity
public class SmiClientsAdditionalEntity {
    private int egenId;

    @javax.persistence.Column(name = "egen_id")
    @Id
    public int getEgenId() {
        return egenId;
    }

    public void setEgenId(int egenId) {
        this.egenId = egenId;
    }

    private String regIp;

    @javax.persistence.Column(name = "reg_ip")
    @Basic
    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    private String regStatus;

    @javax.persistence.Column(name = "reg_status")
    @Basic
    public String getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }

    private int ownerId;

    @javax.persistence.Column(name = "owner_id")
    @Basic
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    private String interestsWords;

    @javax.persistence.Column(name = "interests_words")
    @Basic
    public String getInterestsWords() {
        return interestsWords;
    }

    public void setInterestsWords(String interestsWords) {
        this.interestsWords = interestsWords;
    }

    private String interestsCats;

    @javax.persistence.Column(name = "interests_cats")
    @Basic
    public String getInterestsCats() {
        return interestsCats;
    }

    public void setInterestsCats(String interestsCats) {
        this.interestsCats = interestsCats;
    }

    private boolean interestsOnlyactual;

    @javax.persistence.Column(name = "interests_onlyactual")
    @Basic
    public boolean isInterestsOnlyactual() {
        return interestsOnlyactual;
    }

    public void setInterestsOnlyactual(boolean interestsOnlyactual) {
        this.interestsOnlyactual = interestsOnlyactual;
    }

    private String attractType;

    @javax.persistence.Column(name = "attract_type")
    @Basic
    public String getAttractType() {
        return attractType;
    }

    public void setAttractType(String attractType) {
        this.attractType = attractType;
    }

    private String adscmptype;

    @javax.persistence.Column(name = "adscmptype")
    @Basic
    public String getAdscmptype() {
        return adscmptype;
    }

    public void setAdscmptype(String adscmptype) {
        this.adscmptype = adscmptype;
    }

    private int unreadMess;

    @javax.persistence.Column(name = "unread_mess")
    @Basic
    public int getUnreadMess() {
        return unreadMess;
    }

    public void setUnreadMess(int unreadMess) {
        this.unreadMess = unreadMess;
    }

    private int unreadNotificationsFriend;

    @javax.persistence.Column(name = "unread_notifications_friend")
    @Basic
    public int getUnreadNotificationsFriend() {
        return unreadNotificationsFriend;
    }

    public void setUnreadNotificationsFriend(int unreadNotificationsFriend) {
        this.unreadNotificationsFriend = unreadNotificationsFriend;
    }

    private int unreadNotificationsNotice;

    @javax.persistence.Column(name = "unread_notifications_notice")
    @Basic
    public int getUnreadNotificationsNotice() {
        return unreadNotificationsNotice;
    }

    public void setUnreadNotificationsNotice(int unreadNotificationsNotice) {
        this.unreadNotificationsNotice = unreadNotificationsNotice;
    }

    private int unreadNotificationsPeople;

    @javax.persistence.Column(name = "unread_notifications_people")
    @Basic
    public int getUnreadNotificationsPeople() {
        return unreadNotificationsPeople;
    }

    public void setUnreadNotificationsPeople(int unreadNotificationsPeople) {
        this.unreadNotificationsPeople = unreadNotificationsPeople;
    }

    private int unreadNotificationsMail;

    @javax.persistence.Column(name = "unread_notifications_mail")
    @Basic
    public int getUnreadNotificationsMail() {
        return unreadNotificationsMail;
    }

    public void setUnreadNotificationsMail(int unreadNotificationsMail) {
        this.unreadNotificationsMail = unreadNotificationsMail;
    }

    private String blogFilter;

    @javax.persistence.Column(name = "blog_filter")
    @Basic
    public String getBlogFilter() {
        return blogFilter;
    }

    public void setBlogFilter(String blogFilter) {
        this.blogFilter = blogFilter;
    }

    private String interests;

    @javax.persistence.Column(name = "interests")
    @Basic
    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmiClientsAdditionalEntity that = (SmiClientsAdditionalEntity) o;

        if (egenId != that.egenId) return false;
        if (interestsOnlyactual != that.interestsOnlyactual) return false;
        if (ownerId != that.ownerId) return false;
        if (unreadMess != that.unreadMess) return false;
        if (unreadNotificationsFriend != that.unreadNotificationsFriend) return false;
        if (unreadNotificationsMail != that.unreadNotificationsMail) return false;
        if (unreadNotificationsNotice != that.unreadNotificationsNotice) return false;
        if (unreadNotificationsPeople != that.unreadNotificationsPeople) return false;
        if (adscmptype != null ? !adscmptype.equals(that.adscmptype) : that.adscmptype != null) return false;
        if (attractType != null ? !attractType.equals(that.attractType) : that.attractType != null) return false;
        if (blogFilter != null ? !blogFilter.equals(that.blogFilter) : that.blogFilter != null) return false;
        if (interests != null ? !interests.equals(that.interests) : that.interests != null) return false;
        if (interestsCats != null ? !interestsCats.equals(that.interestsCats) : that.interestsCats != null)
            return false;
        if (interestsWords != null ? !interestsWords.equals(that.interestsWords) : that.interestsWords != null)
            return false;
        if (regIp != null ? !regIp.equals(that.regIp) : that.regIp != null) return false;
        if (regStatus != null ? !regStatus.equals(that.regStatus) : that.regStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = egenId;
        result = 31 * result + (regIp != null ? regIp.hashCode() : 0);
        result = 31 * result + (regStatus != null ? regStatus.hashCode() : 0);
        result = 31 * result + ownerId;
        result = 31 * result + (interestsWords != null ? interestsWords.hashCode() : 0);
        result = 31 * result + (interestsCats != null ? interestsCats.hashCode() : 0);
        result = 31 * result + (interestsOnlyactual ? 1 : 0);
        result = 31 * result + (attractType != null ? attractType.hashCode() : 0);
        result = 31 * result + (adscmptype != null ? adscmptype.hashCode() : 0);
        result = 31 * result + unreadMess;
        result = 31 * result + unreadNotificationsFriend;
        result = 31 * result + unreadNotificationsNotice;
        result = 31 * result + unreadNotificationsPeople;
        result = 31 * result + unreadNotificationsMail;
        result = 31 * result + (blogFilter != null ? blogFilter.hashCode() : 0);
        result = 31 * result + (interests != null ? interests.hashCode() : 0);
        return result;
    }
}
