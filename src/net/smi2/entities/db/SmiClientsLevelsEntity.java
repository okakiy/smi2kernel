package net.smi2.entities.db;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * User: Oleg Konstantinov
 * Date: 02.02.12
 * Time: 13:36
 */
@javax.persistence.Table(name = "smi_clients_levels", schema = "", catalog = "smi20")
@Entity
public class SmiClientsLevelsEntity {
    private int euserId;

    @javax.persistence.Column(name = "euser_id")
    @Id
    public int getEuserId() {
        return euserId;
    }

    public void setEuserId(int euserId) {
        this.euserId = euserId;
    }

    private int clientId;

    @javax.persistence.Column(name = "client_id")
    @Basic
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    private float experience;

    @javax.persistence.Column(name = "experience")
    @Basic
    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    private int maxLevel;

    @javax.persistence.Column(name = "max_level")
    @Basic
    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    private int curLevel;

    @javax.persistence.Column(name = "cur_level")
    @Basic
    public int getCurLevel() {
        return curLevel;
    }

    public void setCurLevel(int curLevel) {
        this.curLevel = curLevel;
    }

    private int messageLevel;

    @javax.persistence.Column(name = "message_level")
    @Basic
    public int getMessageLevel() {
        return messageLevel;
    }

    public void setMessageLevel(int messageLevel) {
        this.messageLevel = messageLevel;
    }

    private int messageMask;

    @javax.persistence.Column(name = "message_mask")
    @Basic
    public int getMessageMask() {
        return messageMask;
    }

    public void setMessageMask(int messageMask) {
        this.messageMask = messageMask;
    }

    private float curentropy;

    @javax.persistence.Column(name = "curentropy")
    @Basic
    public float getCurentropy() {
        return curentropy;
    }

    public void setCurentropy(float curentropy) {
        this.curentropy = curentropy;
    }

    private byte encouragementEntropy;

    @javax.persistence.Column(name = "encouragement_entropy")
    @Basic
    public byte getEncouragementEntropy() {
        return encouragementEntropy;
    }

    public void setEncouragementEntropy(byte encouragementEntropy) {
        this.encouragementEntropy = encouragementEntropy;
    }

    private int karmaOracleCount;

    @javax.persistence.Column(name = "karma_oracle_count")
    @Basic
    public int getKarmaOracleCount() {
        return karmaOracleCount;
    }

    public void setKarmaOracleCount(int karmaOracleCount) {
        this.karmaOracleCount = karmaOracleCount;
    }

    private Date karmaOracleDt;

    @javax.persistence.Column(name = "karma_oracle_dt")
    @Basic
    public Date getKarmaOracleDt() {
        return karmaOracleDt;
    }

    public void setKarmaOracleDt(Date karmaOracleDt) {
        this.karmaOracleDt = karmaOracleDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmiClientsLevelsEntity that = (SmiClientsLevelsEntity) o;

        if (clientId != that.clientId) return false;
        if (curLevel != that.curLevel) return false;
        if (Float.compare(that.curentropy, curentropy) != 0) return false;
        if (encouragementEntropy != that.encouragementEntropy) return false;
        if (euserId != that.euserId) return false;
        if (Float.compare(that.experience, experience) != 0) return false;
        if (karmaOracleCount != that.karmaOracleCount) return false;
        if (maxLevel != that.maxLevel) return false;
        if (messageLevel != that.messageLevel) return false;
        if (messageMask != that.messageMask) return false;
        if (karmaOracleDt != null ? !karmaOracleDt.equals(that.karmaOracleDt) : that.karmaOracleDt != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = euserId;
        result = 31 * result + clientId;
        result = 31 * result + (experience != +0.0f ? Float.floatToIntBits(experience) : 0);
        result = 31 * result + maxLevel;
        result = 31 * result + curLevel;
        result = 31 * result + messageLevel;
        result = 31 * result + messageMask;
        result = 31 * result + (curentropy != +0.0f ? Float.floatToIntBits(curentropy) : 0);
        result = 31 * result + (int) encouragementEntropy;
        result = 31 * result + karmaOracleCount;
        result = 31 * result + (karmaOracleDt != null ? karmaOracleDt.hashCode() : 0);
        return result;
    }
}
