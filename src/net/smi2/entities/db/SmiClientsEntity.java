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
@javax.persistence.Table(name = "smi_clients", schema = "", catalog = "smi20")
@Entity
public class SmiClientsEntity {
    private int generatorId;

    @javax.persistence.Column(name = "generator_id")
    @Id
    public int getGeneratorId() {
        return generatorId;
    }

    public void setGeneratorId(int generatorId) {
        this.generatorId = generatorId;
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

    private String clientEmail;

    @javax.persistence.Column(name = "client_email")
    @Basic
    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    private String clientNick;

    @javax.persistence.Column(name = "client_nick")
    @Basic
    public String getClientNick() {
        return clientNick;
    }

    public void setClientNick(String clientNick) {
        this.clientNick = clientNick;
    }

    private String clientPass;

    @javax.persistence.Column(name = "client_pass")
    @Basic
    public String getClientPass() {
        return clientPass;
    }

    public void setClientPass(String clientPass) {
        this.clientPass = clientPass;
    }

    private String clientMd5;

    @javax.persistence.Column(name = "client_md5")
    @Basic
    public String getClientMd5() {
        return clientMd5;
    }

    public void setClientMd5(String clientMd5) {
        this.clientMd5 = clientMd5;
    }

    private String clientMd5Forgot;

    @javax.persistence.Column(name = "client_md5_forgot")
    @Basic
    public String getClientMd5Forgot() {
        return clientMd5Forgot;
    }

    public void setClientMd5Forgot(String clientMd5Forgot) {
        this.clientMd5Forgot = clientMd5Forgot;
    }

    private String clientFio;

    @javax.persistence.Column(name = "client_fio")
    @Basic
    public String getClientFio() {
        return clientFio;
    }

    public void setClientFio(String clientFio) {
        this.clientFio = clientFio;
    }

    private String clientEmail1;

    @javax.persistence.Column(name = "client_email1")
    @Basic
    public String getClientEmail1() {
        return clientEmail1;
    }

    public void setClientEmail1(String clientEmail1) {
        this.clientEmail1 = clientEmail1;
    }

    private String clientNote;

    @javax.persistence.Column(name = "client_note")
    @Basic
    public String getClientNote() {
        return clientNote;
    }

    public void setClientNote(String clientNote) {
        this.clientNote = clientNote;
    }

    private String clientSign;

    @javax.persistence.Column(name = "client_sign")
    @Basic
    public String getClientSign() {
        return clientSign;
    }

    public void setClientSign(String clientSign) {
        this.clientSign = clientSign;
    }

    private int avatarId;

    @javax.persistence.Column(name = "avatar_id")
    @Basic
    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }

    private int interfaces;

    @javax.persistence.Column(name = "interfaces")
    @Basic
    public int getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(int interfaces) {
        this.interfaces = interfaces;
    }

    private String site;

    @javax.persistence.Column(name = "site")
    @Basic
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    private String icq;

    @javax.persistence.Column(name = "icq")
    @Basic
    public String getIcq() {
        return icq;
    }

    public void setIcq(String icq) {
        this.icq = icq;
    }

    private String clientCity;

    @javax.persistence.Column(name = "client_city")
    @Basic
    public String getClientCity() {
        return clientCity;
    }

    public void setClientCity(String clientCity) {
        this.clientCity = clientCity;
    }

    private float ef;

    @javax.persistence.Column(name = "ef")
    @Basic
    public float getEf() {
        return ef;
    }

    public void setEf(float ef) {
        this.ef = ef;
    }

    private int odobs;

    @javax.persistence.Column(name = "odobs")
    @Basic
    public int getOdobs() {
        return odobs;
    }

    public void setOdobs(int odobs) {
        this.odobs = odobs;
    }

    private int isHaveignored;

    @javax.persistence.Column(name = "is_haveignored")
    @Basic
    public int getHaveignored() {
        return isHaveignored;
    }

    public void setHaveignored(int haveignored) {
        isHaveignored = haveignored;
    }

    private int place;

    @javax.persistence.Column(name = "place")
    @Basic
    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    private float weight;

    @javax.persistence.Column(name = "weight")
    @Basic
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private String weightLock;

    @javax.persistence.Column(name = "weight_lock")
    @Basic
    public String getWeightLock() {
        return weightLock;
    }

    public void setWeightLock(String weightLock) {
        this.weightLock = weightLock;
    }

    private float rate;

    @javax.persistence.Column(name = "rate")
    @Basic
    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    private byte isBanned;

    @javax.persistence.Column(name = "is_banned")
    @Basic
    public byte getBanned() {
        return isBanned;
    }

    public void setBanned(byte banned) {
        isBanned = banned;
    }

    private byte isSendmails;

    @javax.persistence.Column(name = "is_sendmails")
    @Basic
    public byte getSendmails() {
        return isSendmails;
    }

    public void setSendmails(byte sendmails) {
        isSendmails = sendmails;
    }

    private byte isReqauth;

    @javax.persistence.Column(name = "is_reqauth")
    @Basic
    public byte getReqauth() {
        return isReqauth;
    }

    public void setReqauth(byte reqauth) {
        isReqauth = reqauth;
    }

    private String clientFname;

    @javax.persistence.Column(name = "client_fname")
    @Basic
    public String getClientFname() {
        return clientFname;
    }

    public void setClientFname(String clientFname) {
        this.clientFname = clientFname;
    }

    private String clientLname;

    @javax.persistence.Column(name = "client_lname")
    @Basic
    public String getClientLname() {
        return clientLname;
    }

    public void setClientLname(String clientLname) {
        this.clientLname = clientLname;
    }

    private String clientGender;

    @javax.persistence.Column(name = "client_gender")
    @Basic
    public String getClientGender() {
        return clientGender;
    }

    public void setClientGender(String clientGender) {
        this.clientGender = clientGender;
    }

    private String clientBirthdate;

    @javax.persistence.Column(name = "client_birthdate")
    @Basic
    public String getClientBirthdate() {
        return clientBirthdate;
    }

    public void setClientBirthdate(String clientBirthdate) {
        this.clientBirthdate = clientBirthdate;
    }

    private String clientLanguages;

    @javax.persistence.Column(name = "client_languages")
    @Basic
    public String getClientLanguages() {
        return clientLanguages;
    }

    public void setClientLanguages(String clientLanguages) {
        this.clientLanguages = clientLanguages;
    }

    private String clientCountry;

    @javax.persistence.Column(name = "client_country")
    @Basic
    public String getClientCountry() {
        return clientCountry;
    }

    public void setClientCountry(String clientCountry) {
        this.clientCountry = clientCountry;
    }

    private String clientAbout;

    @javax.persistence.Column(name = "client_about")
    @Basic
    public String getClientAbout() {
        return clientAbout;
    }

    public void setClientAbout(String clientAbout) {
        this.clientAbout = clientAbout;
    }

    private String clientEducation;

    @javax.persistence.Column(name = "client_education")
    @Basic
    public String getClientEducation() {
        return clientEducation;
    }

    public void setClientEducation(String clientEducation) {
        this.clientEducation = clientEducation;
    }

    private String clientSchool;

    @javax.persistence.Column(name = "client_school")
    @Basic
    public String getClientSchool() {
        return clientSchool;
    }

    public void setClientSchool(String clientSchool) {
        this.clientSchool = clientSchool;
    }

    private String clientIncomeLevel;

    @javax.persistence.Column(name = "client_income_level")
    @Basic
    public String getClientIncomeLevel() {
        return clientIncomeLevel;
    }

    public void setClientIncomeLevel(String clientIncomeLevel) {
        this.clientIncomeLevel = clientIncomeLevel;
    }

    private String clientMname;

    @javax.persistence.Column(name = "client_mname")
    @Basic
    public String getClientMname() {
        return clientMname;
    }

    public void setClientMname(String clientMname) {
        this.clientMname = clientMname;
    }

    private String clientCemail;

    @javax.persistence.Column(name = "client_cemail")
    @Basic
    public String getClientCemail() {
        return clientCemail;
    }

    public void setClientCemail(String clientCemail) {
        this.clientCemail = clientCemail;
    }

    private String clientPhone;

    @javax.persistence.Column(name = "client_phone")
    @Basic
    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    private String clientPost;

    @javax.persistence.Column(name = "client_post")
    @Basic
    public String getClientPost() {
        return clientPost;
    }

    public void setClientPost(String clientPost) {
        this.clientPost = clientPost;
    }

    private String clientWork;

    @javax.persistence.Column(name = "client_work")
    @Basic
    public String getClientWork() {
        return clientWork;
    }

    public void setClientWork(String clientWork) {
        this.clientWork = clientWork;
    }

    private String emailmd5;

    @javax.persistence.Column(name = "emailmd5")
    @Basic
    public String getEmailmd5() {
        return emailmd5;
    }

    public void setEmailmd5(String emailmd5) {
        this.emailmd5 = emailmd5;
    }

    private int complaint;

    @javax.persistence.Column(name = "complaint")
    @Basic
    public int getComplaint() {
        return complaint;
    }

    public void setComplaint(int complaint) {
        this.complaint = complaint;
    }

    private int servicePartnerId;

    @javax.persistence.Column(name = "service_partner_id")
    @Basic
    public int getServicePartnerId() {
        return servicePartnerId;
    }

    public void setServicePartnerId(int servicePartnerId) {
        this.servicePartnerId = servicePartnerId;
    }

    private String clientNickRus;

    @javax.persistence.Column(name = "client_nick_rus")
    @Basic
    public String getClientNickRus() {
        return clientNickRus;
    }

    public void setClientNickRus(String clientNickRus) {
        this.clientNickRus = clientNickRus;
    }

    private String paymentType;

    @javax.persistence.Column(name = "payment_type")
    @Basic
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    private String openId;

    @javax.persistence.Column(name = "open_id")
    @Basic
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    private String check;

    @javax.persistence.Column(name = "check")
    @Basic
    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    private int ratePos;

    @javax.persistence.Column(name = "rate_pos")
    @Basic
    public int getRatePos() {
        return ratePos;
    }

    public void setRatePos(int ratePos) {
        this.ratePos = ratePos;
    }

    private String expert;

    @javax.persistence.Column(name = "expert")
    @Basic
    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    private String correspondent;

    @javax.persistence.Column(name = "correspondent")
    @Basic
    public String getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(String correspondent) {
        this.correspondent = correspondent;
    }

    private String notificationComments;

    @javax.persistence.Column(name = "notification_comments")
    @Basic
    public String getNotificationComments() {
        return notificationComments;
    }

    public void setNotificationComments(String notificationComments) {
        this.notificationComments = notificationComments;
    }

    private String notificationOther;

    @javax.persistence.Column(name = "notification_other")
    @Basic
    public String getNotificationOther() {
        return notificationOther;
    }

    public void setNotificationOther(String notificationOther) {
        this.notificationOther = notificationOther;
    }

    private byte encouragement;

    @javax.persistence.Column(name = "encouragement")
    @Basic
    public byte getEncouragement() {
        return encouragement;
    }

    public void setEncouragement(byte encouragement) {
        this.encouragement = encouragement;
    }

    private String smiEmail;

    @javax.persistence.Column(name = "smi_email")
    @Basic
    public String getSmiEmail() {
        return smiEmail;
    }

    public void setSmiEmail(String smiEmail) {
        this.smiEmail = smiEmail;
    }

    private String smiEmailPasswd;

    @javax.persistence.Column(name = "smi_email_passwd")
    @Basic
    public String getSmiEmailPasswd() {
        return smiEmailPasswd;
    }

    public void setSmiEmailPasswd(String smiEmailPasswd) {
        this.smiEmailPasswd = smiEmailPasswd;
    }

    private Timestamp smiEmailChecked;

    @javax.persistence.Column(name = "smi_email_checked")
    @Basic
    public Timestamp getSmiEmailChecked() {
        return smiEmailChecked;
    }

    public void setSmiEmailChecked(Timestamp smiEmailChecked) {
        this.smiEmailChecked = smiEmailChecked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmiClientsEntity that = (SmiClientsEntity) o;

        if (avatarId != that.avatarId) return false;
        if (complaint != that.complaint) return false;
        if (Float.compare(that.ef, ef) != 0) return false;
        if (encouragement != that.encouragement) return false;
        if (generatorId != that.generatorId) return false;
        if (interfaces != that.interfaces) return false;
        if (isBanned != that.isBanned) return false;
        if (isHaveignored != that.isHaveignored) return false;
        if (isReqauth != that.isReqauth) return false;
        if (isSendmails != that.isSendmails) return false;
        if (odobs != that.odobs) return false;
        if (place != that.place) return false;
        if (Float.compare(that.rate, rate) != 0) return false;
        if (ratePos != that.ratePos) return false;
        if (servicePartnerId != that.servicePartnerId) return false;
        if (Float.compare(that.weight, weight) != 0) return false;
        if (check != null ? !check.equals(that.check) : that.check != null) return false;
        if (clientAbout != null ? !clientAbout.equals(that.clientAbout) : that.clientAbout != null) return false;
        if (clientBirthdate != null ? !clientBirthdate.equals(that.clientBirthdate) : that.clientBirthdate != null)
            return false;
        if (clientCemail != null ? !clientCemail.equals(that.clientCemail) : that.clientCemail != null) return false;
        if (clientCity != null ? !clientCity.equals(that.clientCity) : that.clientCity != null) return false;
        if (clientCountry != null ? !clientCountry.equals(that.clientCountry) : that.clientCountry != null)
            return false;
        if (clientEducation != null ? !clientEducation.equals(that.clientEducation) : that.clientEducation != null)
            return false;
        if (clientEmail != null ? !clientEmail.equals(that.clientEmail) : that.clientEmail != null) return false;
        if (clientEmail1 != null ? !clientEmail1.equals(that.clientEmail1) : that.clientEmail1 != null) return false;
        if (clientFio != null ? !clientFio.equals(that.clientFio) : that.clientFio != null) return false;
        if (clientFname != null ? !clientFname.equals(that.clientFname) : that.clientFname != null) return false;
        if (clientGender != null ? !clientGender.equals(that.clientGender) : that.clientGender != null) return false;
        if (clientIncomeLevel != null ? !clientIncomeLevel.equals(that.clientIncomeLevel) : that.clientIncomeLevel != null)
            return false;
        if (clientLanguages != null ? !clientLanguages.equals(that.clientLanguages) : that.clientLanguages != null)
            return false;
        if (clientLname != null ? !clientLname.equals(that.clientLname) : that.clientLname != null) return false;
        if (clientMd5 != null ? !clientMd5.equals(that.clientMd5) : that.clientMd5 != null) return false;
        if (clientMd5Forgot != null ? !clientMd5Forgot.equals(that.clientMd5Forgot) : that.clientMd5Forgot != null)
            return false;
        if (clientMname != null ? !clientMname.equals(that.clientMname) : that.clientMname != null) return false;
        if (clientNick != null ? !clientNick.equals(that.clientNick) : that.clientNick != null) return false;
        if (clientNickRus != null ? !clientNickRus.equals(that.clientNickRus) : that.clientNickRus != null)
            return false;
        if (clientNote != null ? !clientNote.equals(that.clientNote) : that.clientNote != null) return false;
        if (clientPass != null ? !clientPass.equals(that.clientPass) : that.clientPass != null) return false;
        if (clientPhone != null ? !clientPhone.equals(that.clientPhone) : that.clientPhone != null) return false;
        if (clientPost != null ? !clientPost.equals(that.clientPost) : that.clientPost != null) return false;
        if (clientSchool != null ? !clientSchool.equals(that.clientSchool) : that.clientSchool != null) return false;
        if (clientSign != null ? !clientSign.equals(that.clientSign) : that.clientSign != null) return false;
        if (clientWork != null ? !clientWork.equals(that.clientWork) : that.clientWork != null) return false;
        if (correspondent != null ? !correspondent.equals(that.correspondent) : that.correspondent != null)
            return false;
        if (dt != null ? !dt.equals(that.dt) : that.dt != null) return false;
        if (emailmd5 != null ? !emailmd5.equals(that.emailmd5) : that.emailmd5 != null) return false;
        if (expert != null ? !expert.equals(that.expert) : that.expert != null) return false;
        if (icq != null ? !icq.equals(that.icq) : that.icq != null) return false;
        if (notificationComments != null ? !notificationComments.equals(that.notificationComments) : that.notificationComments != null)
            return false;
        if (notificationOther != null ? !notificationOther.equals(that.notificationOther) : that.notificationOther != null)
            return false;
        if (openId != null ? !openId.equals(that.openId) : that.openId != null) return false;
        if (paymentType != null ? !paymentType.equals(that.paymentType) : that.paymentType != null) return false;
        if (site != null ? !site.equals(that.site) : that.site != null) return false;
        if (smiEmail != null ? !smiEmail.equals(that.smiEmail) : that.smiEmail != null) return false;
        if (smiEmailChecked != null ? !smiEmailChecked.equals(that.smiEmailChecked) : that.smiEmailChecked != null)
            return false;
        if (smiEmailPasswd != null ? !smiEmailPasswd.equals(that.smiEmailPasswd) : that.smiEmailPasswd != null)
            return false;
        if (weightLock != null ? !weightLock.equals(that.weightLock) : that.weightLock != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = generatorId;
        result = 31 * result + (dt != null ? dt.hashCode() : 0);
        result = 31 * result + (clientEmail != null ? clientEmail.hashCode() : 0);
        result = 31 * result + (clientNick != null ? clientNick.hashCode() : 0);
        result = 31 * result + (clientPass != null ? clientPass.hashCode() : 0);
        result = 31 * result + (clientMd5 != null ? clientMd5.hashCode() : 0);
        result = 31 * result + (clientMd5Forgot != null ? clientMd5Forgot.hashCode() : 0);
        result = 31 * result + (clientFio != null ? clientFio.hashCode() : 0);
        result = 31 * result + (clientEmail1 != null ? clientEmail1.hashCode() : 0);
        result = 31 * result + (clientNote != null ? clientNote.hashCode() : 0);
        result = 31 * result + (clientSign != null ? clientSign.hashCode() : 0);
        result = 31 * result + avatarId;
        result = 31 * result + interfaces;
        result = 31 * result + (site != null ? site.hashCode() : 0);
        result = 31 * result + (icq != null ? icq.hashCode() : 0);
        result = 31 * result + (clientCity != null ? clientCity.hashCode() : 0);
        result = 31 * result + (ef != +0.0f ? Float.floatToIntBits(ef) : 0);
        result = 31 * result + odobs;
        result = 31 * result + isHaveignored;
        result = 31 * result + place;
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + (weightLock != null ? weightLock.hashCode() : 0);
        result = 31 * result + (rate != +0.0f ? Float.floatToIntBits(rate) : 0);
        result = 31 * result + (int) isBanned;
        result = 31 * result + (int) isSendmails;
        result = 31 * result + (int) isReqauth;
        result = 31 * result + (clientFname != null ? clientFname.hashCode() : 0);
        result = 31 * result + (clientLname != null ? clientLname.hashCode() : 0);
        result = 31 * result + (clientGender != null ? clientGender.hashCode() : 0);
        result = 31 * result + (clientBirthdate != null ? clientBirthdate.hashCode() : 0);
        result = 31 * result + (clientLanguages != null ? clientLanguages.hashCode() : 0);
        result = 31 * result + (clientCountry != null ? clientCountry.hashCode() : 0);
        result = 31 * result + (clientAbout != null ? clientAbout.hashCode() : 0);
        result = 31 * result + (clientEducation != null ? clientEducation.hashCode() : 0);
        result = 31 * result + (clientSchool != null ? clientSchool.hashCode() : 0);
        result = 31 * result + (clientIncomeLevel != null ? clientIncomeLevel.hashCode() : 0);
        result = 31 * result + (clientMname != null ? clientMname.hashCode() : 0);
        result = 31 * result + (clientCemail != null ? clientCemail.hashCode() : 0);
        result = 31 * result + (clientPhone != null ? clientPhone.hashCode() : 0);
        result = 31 * result + (clientPost != null ? clientPost.hashCode() : 0);
        result = 31 * result + (clientWork != null ? clientWork.hashCode() : 0);
        result = 31 * result + (emailmd5 != null ? emailmd5.hashCode() : 0);
        result = 31 * result + complaint;
        result = 31 * result + servicePartnerId;
        result = 31 * result + (clientNickRus != null ? clientNickRus.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (openId != null ? openId.hashCode() : 0);
        result = 31 * result + (check != null ? check.hashCode() : 0);
        result = 31 * result + ratePos;
        result = 31 * result + (expert != null ? expert.hashCode() : 0);
        result = 31 * result + (correspondent != null ? correspondent.hashCode() : 0);
        result = 31 * result + (notificationComments != null ? notificationComments.hashCode() : 0);
        result = 31 * result + (notificationOther != null ? notificationOther.hashCode() : 0);
        result = 31 * result + (int) encouragement;
        result = 31 * result + (smiEmail != null ? smiEmail.hashCode() : 0);
        result = 31 * result + (smiEmailPasswd != null ? smiEmailPasswd.hashCode() : 0);
        result = 31 * result + (smiEmailChecked != null ? smiEmailChecked.hashCode() : 0);
        return result;
    }
}
