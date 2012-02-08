package net.smi2.entities.db;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: Oleg Konstantinov
 * Date: 02.02.12
 * Time: 13:25
 */
@javax.persistence.Table(name = "smi_clans", schema = "", catalog = "smi20")
@Entity
public class SmiClansEntity extends Smi2Entity {
    private int id;

    @javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String clanName;

    @javax.persistence.Column(name = "clan_name")
    @Basic
    public String getClanName() {
        return clanName;
    }

    public void setClanName(String clanName) {
        this.clanName = clanName;
    }

    private int clanOwnerId;

    @javax.persistence.Column(name = "clan_owner_id")
    @Basic
    public int getClanOwnerId() {
        return clanOwnerId;
    }

    public void setClanOwnerId(int clanOwnerId) {
        this.clanOwnerId = clanOwnerId;
    }

    private int clanPresidentId;

    @javax.persistence.Column(name = "clan_president_id")
    @Basic
    public int getClanPresidentId() {
        return clanPresidentId;
    }

    public void setClanPresidentId(int clanPresidentId) {
        this.clanPresidentId = clanPresidentId;
    }

    private int clanTrollId;

    @javax.persistence.Column(name = "clan_troll_id")
    @Basic
    public int getClanTrollId() {
        return clanTrollId;
    }

    public void setClanTrollId(int clanTrollId) {
        this.clanTrollId = clanTrollId;
    }

    private Timestamp clanDt;

    @javax.persistence.Column(name = "clan_dt")
    @Basic
    public Timestamp getClanDt() {
        return clanDt;
    }

    public void setClanDt(Timestamp clanDt) {
        this.clanDt = clanDt;
    }

    private String clanDescription;

    @javax.persistence.Column(name = "clan_description")
    @Basic
    public String getClanDescription() {
        return clanDescription;
    }

    public void setClanDescription(String clanDescription) {
        this.clanDescription = clanDescription;
    }

    private int clanImg;

    @javax.persistence.Column(name = "clan_img")
    @Basic
    public int getClanImg() {
        return clanImg;
    }

    public void setClanImg(int clanImg) {
        this.clanImg = clanImg;
    }

    private String clanStatus;

    @javax.persistence.Column(name = "clan_status")
    @Basic
    public String getClanStatus() {
        return clanStatus;
    }

    public void setClanStatus(String clanStatus) {
        this.clanStatus = clanStatus;
    }

    private int clanMembers;

    @javax.persistence.Column(name = "clan_members")
    @Basic
    public int getClanMembers() {
        return clanMembers;
    }

    public void setClanMembers(int clanMembers) {
        this.clanMembers = clanMembers;
    }

    private int rate;

    @javax.persistence.Column(name = "rate")
    @Basic
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    private int clanNewsCount;

    @javax.persistence.Column(name = "clan_news_count")
    @Basic
    public int getClanNewsCount() {
        return clanNewsCount;
    }

    public void setClanNewsCount(int clanNewsCount) {
        this.clanNewsCount = clanNewsCount;
    }

    private int specialId;

    @javax.persistence.Column(name = "special_id")
    @Basic
    public int getSpecialId() {
        return specialId;
    }

    public void setSpecialId(int specialId) {
        this.specialId = specialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmiClansEntity that = (SmiClansEntity) o;

        if (clanImg != that.clanImg) return false;
        if (clanMembers != that.clanMembers) return false;
        if (clanNewsCount != that.clanNewsCount) return false;
        if (clanOwnerId != that.clanOwnerId) return false;
        if (clanPresidentId != that.clanPresidentId) return false;
        if (clanTrollId != that.clanTrollId) return false;
        if (id != that.id) return false;
        if (rate != that.rate) return false;
        if (specialId != that.specialId) return false;
        if (clanDescription != null ? !clanDescription.equals(that.clanDescription) : that.clanDescription != null)
            return false;
        if (clanDt != null ? !clanDt.equals(that.clanDt) : that.clanDt != null) return false;
        if (clanName != null ? !clanName.equals(that.clanName) : that.clanName != null) return false;
        if (clanStatus != null ? !clanStatus.equals(that.clanStatus) : that.clanStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (clanName != null ? clanName.hashCode() : 0);
        result = 31 * result + clanOwnerId;
        result = 31 * result + clanPresidentId;
        result = 31 * result + clanTrollId;
        result = 31 * result + (clanDt != null ? clanDt.hashCode() : 0);
        result = 31 * result + (clanDescription != null ? clanDescription.hashCode() : 0);
        result = 31 * result + clanImg;
        result = 31 * result + (clanStatus != null ? clanStatus.hashCode() : 0);
        result = 31 * result + clanMembers;
        result = 31 * result + rate;
        result = 31 * result + clanNewsCount;
        result = 31 * result + specialId;
        return result;
    }
}
