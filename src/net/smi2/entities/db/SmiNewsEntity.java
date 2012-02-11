package net.smi2.entities.db;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * User: Oleg Konstantinov
 * Date: 02.02.12
 * Time: 13:36
 */
@javax.persistence.Table(name = "smi_news", schema = "", catalog = "")
@Entity
public class SmiNewsEntity extends Smi2Entity {
    private Integer id;

	@javax.persistence.Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int  id) {
        this.id = id;
    }

    private String status;

    @JsonIgnore
	@javax.persistence.Column(name = "status")
    @Basic
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Integer odob;

    @JsonIgnore
	@javax.persistence.Column(name = "odob")
    @Basic
    public Integer getOdob() {
        return odob;
    }

    public void setOdob(Integer  odob) {
        this.odob = odob;
    }

    private float odobReal;

    @JsonIgnore
	@javax.persistence.Column(name = "odob_real")
    @Basic
    public float getOdobReal() {
        return odobReal;
    }

    public void setOdobReal(float odobReal) {
        this.odobReal = odobReal;
    }

    private Integer spam;

    @JsonIgnore
	@javax.persistence.Column(name = "spam")
    @Basic
    public Integer getSpam() {
        return spam;
    }

    public void setSpam(Integer  spam) {
        this.spam = spam;
    }

    private float spamReal;

    @JsonIgnore
	@javax.persistence.Column(name = "spam_real")
    @Basic
    public float getSpamReal() {
        return spamReal;
    }

    public void setSpamReal(float spamReal) {
        this.spamReal = spamReal;
    }

    private String title;

	@javax.persistence.Column(name = "title")
    @Basic
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String titleSecond;

    @JsonIgnore
	@javax.persistence.Column(name = "title_second", nullable=true)
    @Basic
    public String getTitleSecond() {
        return titleSecond;
    }

    public void setTitleSecond(String titleSecond) {
        this.titleSecond = titleSecond;
    }

    private String author;

    @JsonIgnore
	@javax.persistence.Column(name = "author")
    @Basic
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

/*
    @ManyToOne(cascade= {CascadeType.REFRESH}, fetch=FetchType.LAZY )
    @JoinColumn(name="author_id", referencedColumnName = "generator_id",table = "smi_clients")
    private SmiClientsEntity smi_clients;
*/

    private Integer authorId;

    @JsonIgnore
	@javax.persistence.Column(name = "author_id")
    @Basic
    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer  authorId) {
        this.authorId = authorId;
    }

    private Integer authorEid;

    @JsonIgnore
	@javax.persistence.Column(name = "author_eid")
    @Basic
    public Integer getAuthorEid() {
        return authorEid;
    }

    public void setAuthorEid(Integer  authorEid) {
        this.authorEid = authorEid;
    }

    private String text;

    @JsonIgnore
	@javax.persistence.Column(name = "text")
    @Basic
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String cat;

    @JsonIgnore
	@javax.persistence.Column(name = "cat")
    @Basic
    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    private String tags;

    @JsonIgnore
	@javax.persistence.Column(name = "tags")
    @Basic
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    private String link;

    @JsonIgnore
	@javax.persistence.Column(name = "link")
    @Basic
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    private String striplink;

    @JsonIgnore
	@javax.persistence.Column(name = "striplink")
    @Basic
    public String getStriplink() {
        return striplink;
    }

    public void setStriplink(String striplink) {
        this.striplink = striplink;
    }

    private Integer imageId;

    @JsonIgnore
	@javax.persistence.Column(name = "image_id")
    @Basic
    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer  imageId) {
        this.imageId = imageId;
    }

    private Integer comments;

    @JsonIgnore
	@javax.persistence.Column(name = "comments")
    @Basic
    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer  comments) {
        this.comments = comments;
    }

    private Integer comments0;

    @JsonIgnore
	@javax.persistence.Column(name = "comments0", nullable=true)
    @Basic
    public Integer getComments0() {
        return comments0;
    }

    public void setComments0(Integer  comments0) {
        this.comments0 = comments0;
    }

    private Integer lastCommentId;

    @JsonIgnore
	@javax.persistence.Column(name = "last_comment_id", nullable=true)
    @Basic
    public Integer getLastCommentId() {
        return lastCommentId;
    }

    public void setLastCommentId(Integer  lastCommentId) {
        this.lastCommentId = lastCommentId;
    }

    private float weight;

    @JsonIgnore
	@javax.persistence.Column(name = "weight")
    @Basic
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    private Integer wsourceId;

    @JsonIgnore
	@javax.persistence.Column(name = "wsource_id")
    @Basic
    public Integer getWsourceId() {
        return wsourceId;
    }

    public void setWsourceId(Integer  wsourceId) {
        this.wsourceId = wsourceId;
    }

    private Integer sourceId;

    @JsonIgnore
	@javax.persistence.Column(name = "source_id")
    @Basic
    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer  sourceId) {
        this.sourceId = sourceId;
    }

    private Integer catId;

    @JsonIgnore
	@javax.persistence.Column(name = "cat_id")
    @Basic
    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer  catId) {
        this.catId = catId;
    }

    private Timestamp addDate;

    @JsonIgnore
	@javax.persistence.Column(name = "add_date")
    @Basic
    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    private Integer showSite;

    @JsonIgnore
	@javax.persistence.Column(name = "show_site")
    @Basic
    public Integer getShowSite() {
        return showSite;
    }

    public void setShowSite(Integer  showSite) {
        this.showSite = showSite;
    }

    private Integer clickSite;

    @JsonIgnore
	@javax.persistence.Column(name = "click_site")
    @Basic
    public Integer getClickSite() {
        return clickSite;
    }

    public void setClickSite(Integer  clickSite) {
        this.clickSite = clickSite;
    }

    private Integer showPatrner;

    @JsonIgnore
	@javax.persistence.Column(name = "show_patrner")
    @Basic
    public Integer getShowPatrner() {
        return showPatrner;
    }

    public void setShowPatrner(Integer  showPatrner) {
        this.showPatrner = showPatrner;
    }

    private Integer clickPartner;

    @JsonIgnore
	@javax.persistence.Column(name = "click_partner")
    @Basic
    public Integer getClickPartner() {
        return clickPartner;
    }

    public void setClickPartner(Integer  clickPartner) {
        this.clickPartner = clickPartner;
    }

    private Integer clickRss;

    @JsonIgnore
	@javax.persistence.Column(name = "click_rss")
    @Basic
    public Integer getClickRss() {
        return clickRss;
    }

    public void setClickRss(Integer  clickRss) {
        this.clickRss = clickRss;
    }

    private Integer  odobLevel;

    @JsonIgnore
	@javax.persistence.Column(name = "odob_level")
    @Basic
    public Integer  getOdobLevel() {
        return odobLevel;
    }

    public void setOdobLevel(Integer  odobLevel) {
        this.odobLevel = odobLevel;
    }

    private Integer  mod2Rss;

    @JsonIgnore
	@javax.persistence.Column(name = "mod2rss")
    @Basic
    public Integer  getMod2Rss() {
        return mod2Rss;
    }

    public void setMod2Rss(Integer  mod2Rss) {
        this.mod2Rss = mod2Rss;
    }

    private Timestamp date2Rss;

    @JsonIgnore
	@javax.persistence.Column(name = "date2rss")
    @Basic
    public Timestamp getDate2Rss() {
        return date2Rss;
    }

    public void setDate2Rss(Timestamp date2Rss) {
        this.date2Rss = date2Rss;
    }

    private Integer  isNomain;

    @JsonIgnore
	@javax.persistence.Column(name = "is_nomain")
    @Basic
    public Integer  getNomain() {
        return isNomain;
    }

    public void setNomain(Integer  nomain) {
        isNomain = nomain;
    }

    private Timestamp date2Yrss;

    @JsonIgnore
	@javax.persistence.Column(name = "date2yrss")
    @Basic
    public Timestamp getDate2Yrss() {
        return date2Yrss;
    }

    public void setDate2Yrss(Timestamp date2Yrss) {
        this.date2Yrss = date2Yrss;
    }

    private Integer fulltextId;

    @JsonIgnore
	@javax.persistence.Column(name = "fulltext_id")
    @Basic
    public Integer getFulltextId() {
        return fulltextId;
    }

    public void setFulltextId(Integer  fulltextId) {
        this.fulltextId = fulltextId;
    }

    private Integer  type;

    @JsonIgnore
	@javax.persistence.Column(name = "type")
    @Basic
    public Integer  getType() {
        return type;
    }

    public void setType(Integer  type) {
        this.type = type;
    }

    private Integer  isEditorial;

    @JsonIgnore
	@javax.persistence.Column(name = "is_editorial")
    @Basic
    public Integer  getEditorial() {
        return isEditorial;
    }

    public void setEditorial(Integer  editorial) {
        isEditorial = editorial;
    }

    private String smiImage;

    @JsonIgnore
	@javax.persistence.Column(name = "smi_image")
    @Basic
    public String getSmiImage() {
        return smiImage;
    }

    public void setSmiImage(String smiImage) {
        this.smiImage = smiImage;
    }

    private String smiVideo;

    @JsonIgnore
	@javax.persistence.Column(name = "smi_video")
    @Basic
    public String getSmiVideo() {
        return smiVideo;
    }

    public void setSmiVideo(String smiVideo) {
        this.smiVideo = smiVideo;
    }

    private String sourceUrl;

    @JsonIgnore
	@javax.persistence.Column(name = "source_url")
    @Basic
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    private String smiVideoHtml;

    @JsonIgnore
	@javax.persistence.Column(name = "smi_video_html", nullable=true)
    @Basic
    public String getSmiVideoHtml() {
        return smiVideoHtml;
    }

    public void setSmiVideoHtml(String smiVideoHtml) {
        this.smiVideoHtml = smiVideoHtml;
    }

    private float oldWeight;

    @JsonIgnore
	@javax.persistence.Column(name = "old_weight")
    @Basic
    public float getOldWeight() {
        return oldWeight;
    }

    public void setOldWeight(float oldWeight) {
        this.oldWeight = oldWeight;
    }

    private Integer  isAddcomments;

    @JsonIgnore
	@javax.persistence.Column(name = "is_addcomments")
    @Basic
    public Integer  getAddcomments() {
        return isAddcomments;
    }

    public void setAddcomments(Integer  addcomments) {
        isAddcomments = addcomments;
    }

    private Integer answerEid;

    @JsonIgnore
	@javax.persistence.Column(name = "answer_eid")
    @Basic
    public Integer getAnswerEid() {
        return answerEid;
    }

    public void setAnswerEid(Integer  answerEid) {
        this.answerEid = answerEid;
    }

    private short statusIndex;

    @JsonIgnore
	@javax.persistence.Column(name = "status_index")
    @Basic
    public short getStatusIndex() {
        return statusIndex;
    }

    public void setStatusIndex(short statusIndex) {
        this.statusIndex = statusIndex;
    }

    private Integer partnerId;

    @JsonIgnore
	@javax.persistence.Column(name = "partner_id")
    @Basic
    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer  partnerId) {
        this.partnerId = partnerId;
    }

    private String binds;

    @JsonIgnore
	@javax.persistence.Column(name = "binds")
    @Basic
    public String getBinds() {
        return binds;
    }

    public void setBinds(String binds) {
        this.binds = binds;
    }

    private boolean isCompetitor;

    @JsonIgnore
	@javax.persistence.Column(name = "is_competitor")
    @Basic
    public boolean isCompetitor() {
        return isCompetitor;
    }

    public void setCompetitor(boolean competitor) {
        isCompetitor = competitor;
    }

    private boolean isDraft;

    @JsonIgnore
	@javax.persistence.Column(name = "is_draft")
    @Basic
    public boolean isDraft() {
        return isDraft;
    }

    public void setDraft(boolean draft) {
        isDraft = draft;
    }

    private Integer editorOdob;

    @JsonIgnore
	@javax.persistence.Column(name = "editor_odob")
    @Basic
    public Integer getEditorOdob() {
        return editorOdob;
    }

    public void setEditorOdob(Integer  editorOdob) {
        this.editorOdob = editorOdob;
    }

    private float editorWeight;

    @JsonIgnore
	@javax.persistence.Column(name = "editor_weight")
    @Basic
    public float getEditorWeight() {
        return editorWeight;
    }

    public void setEditorWeight(float editorWeight) {
        this.editorWeight = editorWeight;
    }

    private boolean lastCommenteffect;

    @JsonIgnore
	@javax.persistence.Column(name = "last_commenteffect")
    @Basic
    public boolean isLastCommenteffect() {
        return lastCommenteffect;
    }

    public void setLastCommenteffect(boolean lastCommenteffect) {
        this.lastCommenteffect = lastCommenteffect;
    }

    private Float weightComm;

    @JsonIgnore
	@javax.persistence.Column(name = "weight_comm", nullable=true)
    @Basic
    public Float getWeightComm() {
        return weightComm;
    }

    public void setWeightComm(Float weightComm) {
        this.weightComm = weightComm;
    }

    private String ip;

    @JsonIgnore
	@javax.persistence.Column(name = "ip")
    @Basic
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    private Integer haveGallery;

    @JsonIgnore
	@javax.persistence.Column(name = "have_gallery")
    @Basic
    public Integer getHaveGallery() {
        return haveGallery;
    }

    public void setHaveGallery(Integer  haveGallery) {
        this.haveGallery = haveGallery;
    }

    private Integer odobPositive;

    @JsonIgnore
	@javax.persistence.Column(name = "odob_positive")
    @Basic
    public Integer getOdobPositive() {
        return odobPositive;
    }

    public void setOdobPositive(Integer  odobPositive) {
        this.odobPositive = odobPositive;
    }

    private Integer odobNegative;

    @JsonIgnore
	@javax.persistence.Column(name = "odob_negative")
    @Basic
    public Integer getOdobNegative() {
        return odobNegative;
    }

    public void setOdobNegative(Integer  odobNegative) {
        this.odobNegative = odobNegative;
    }

    private String paidArticleStatus;

    @JsonIgnore
	@javax.persistence.Column(name = "paid_article_status", nullable=true)
    @Basic
    public String getPaidArticleStatus() {
        return paidArticleStatus;
    }

    public void setPaidArticleStatus(String paidArticleStatus) {
        this.paidArticleStatus = paidArticleStatus;
    }

    private Integer haveSpecialComment;

    @JsonIgnore
	@javax.persistence.Column(name = "have_special_comment", nullable=true)
    @Basic
    public Integer getHaveSpecialComment() {
        return haveSpecialComment;
    }

    public void setHaveSpecialComment(Integer  haveSpecialComment) {
        this.haveSpecialComment = haveSpecialComment;
    }

    private Integer haveBf;

    @JsonIgnore
	@javax.persistence.Column(name = "have_bf", nullable=true)
    @Basic
    public Integer getHaveBf() {
        return haveBf;
    }

    public void setHaveBf(Integer haveBf) {
        this.haveBf = haveBf;
    }

    private Integer haveChains;

    @JsonIgnore
	@javax.persistence.Column(name = "have_chains")
    @Basic
    public Integer getHaveChains() {
        return haveChains;
    }

    public void setHaveChains(Integer  haveChains) {
        this.haveChains = haveChains;
    }

    private boolean isClannews;

    @JsonIgnore
	@javax.persistence.Column(name = "is_clannews")
    @Basic
    public boolean isClannews() {
        return isClannews;
    }

    public void setClannews(boolean clannews) {
        isClannews = clannews;
    }

    private Integer  isHavehistory;

    @JsonIgnore
	@javax.persistence.Column(name = "is_havehistory")
    @Basic
    public Integer  getHavehistory() {
        return isHavehistory;
    }

    public void setHavehistory(Integer  havehistory) {
        isHavehistory = havehistory;
    }

    private boolean isBookmark;

    @JsonIgnore
	@javax.persistence.Column(name = "is_bookmark")
    @Basic
    public boolean isBookmark() {
        return isBookmark;
    }

    public void setBookmark(boolean bookmark) {
        isBookmark = bookmark;
    }

    private Timestamp lastUpdateTime;

    @JsonIgnore
	@javax.persistence.Column(name = "last_update_time")
    @Basic
    public Timestamp getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    private Timestamp topDate;

    @JsonIgnore
	@javax.persistence.Column(name = "top_date", nullable=true)
    @Basic
    public Timestamp getTopDate() {
        return topDate;
    }

    public void setTopDate(Timestamp topDate) {
        this.topDate = topDate;
    }

    private String language;

    @JsonIgnore
	@javax.persistence.Column(name = "language")
    @Basic
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private Integer adPrice;

    @JsonIgnore
	@javax.persistence.Column(name = "ad_price")
    @Basic
    public Integer getAdPrice() {
        return adPrice;
    }

    public void setAdPrice(Integer  adPrice) {
        this.adPrice = adPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmiNewsEntity that = (SmiNewsEntity) o;

        if (!adPrice.equals(that.adPrice)) return false;
        if (!answerEid.equals(that.answerEid)) return false;
        if (!authorEid.equals(that.authorEid)) return false;
        if (!authorId.equals(that.authorId)) return false;
        if (!catId.equals(that.catId)) return false;
        if (!clickPartner.equals(that.clickPartner)) return false;
        if (!clickRss.equals(that.clickRss)) return false;
        if (!clickSite.equals(that.clickSite)) return false;
        if (!comments.equals(that.comments)) return false;
        if (!comments0.equals(that.comments0)) return false;
        if (!editorOdob.equals(that.editorOdob)) return false;
        if (Float.compare(that.editorWeight, editorWeight) != 0) return false;
        if (!fulltextId.equals(that.fulltextId)) return false;
        if (!haveBf.equals(that.haveBf)) return false;
        if (!haveChains.equals(that.haveChains)) return false;
        if (!haveGallery.equals(that.haveGallery)) return false;
        if (!haveSpecialComment.equals(that.haveSpecialComment)) return false;
        if (!id.equals(that.id)) return false;
        if (!imageId.equals(that.imageId)) return false;
        if (!isAddcomments.equals(that.isAddcomments)) return false;
        if (isBookmark != that.isBookmark) return false;
        if (isClannews != that.isClannews) return false;
        if (isCompetitor != that.isCompetitor) return false;
        if (isDraft != that.isDraft) return false;
        if (!isEditorial.equals(that.isEditorial)) return false;
        if (!isHavehistory.equals(that.isHavehistory)) return false;
        if (!isNomain.equals(that.isNomain)) return false;
        if (!lastCommentId.equals(that.lastCommentId)) return false;
        if (lastCommenteffect != that.lastCommenteffect) return false;
        if (!mod2Rss.equals(that.mod2Rss)) return false;
        if (!odob.equals(that.odob)) return false;
        if (!odobLevel.equals(that.odobLevel)) return false;
        if (!odobNegative.equals(that.odobNegative)) return false;
        if (!odobPositive.equals(that.odobPositive)) return false;
        if (Float.compare(that.odobReal, odobReal) != 0) return false;
        if (Float.compare(that.oldWeight, oldWeight) != 0) return false;
        if (!partnerId.equals(that.partnerId)) return false;
        if (!showPatrner.equals(that.showPatrner)) return false;
        if (!showSite.equals(that.showSite)) return false;
        if (!sourceId.equals(that.sourceId)) return false;
        if (!spam.equals(that.spam)) return false;
        if (Float.compare(that.spamReal, spamReal) != 0) return false;
        if (statusIndex != that.statusIndex) return false;
        if (!type.equals(that.type)) return false;
        if (Float.compare(that.weight, weight) != 0) return false;
        if (Float.compare(that.weightComm, weightComm) != 0) return false;
        if (!wsourceId.equals(that.wsourceId)) return false;
        if (addDate != null ? !addDate.equals(that.addDate) : that.addDate != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (binds != null ? !binds.equals(that.binds) : that.binds != null) return false;
        if (cat != null ? !cat.equals(that.cat) : that.cat != null) return false;
        if (date2Rss != null ? !date2Rss.equals(that.date2Rss) : that.date2Rss != null) return false;
        if (date2Yrss != null ? !date2Yrss.equals(that.date2Yrss) : that.date2Yrss != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (lastUpdateTime != null ? !lastUpdateTime.equals(that.lastUpdateTime) : that.lastUpdateTime != null)
            return false;
        if (link != null ? !link.equals(that.link) : that.link != null) return false;
        if (paidArticleStatus != null ? !paidArticleStatus.equals(that.paidArticleStatus) : that.paidArticleStatus != null)
            return false;
        if (smiImage != null ? !smiImage.equals(that.smiImage) : that.smiImage != null) return false;
        if (smiVideo != null ? !smiVideo.equals(that.smiVideo) : that.smiVideo != null) return false;
        if (smiVideoHtml != null ? !smiVideoHtml.equals(that.smiVideoHtml) : that.smiVideoHtml != null) return false;
        if (sourceUrl != null ? !sourceUrl.equals(that.sourceUrl) : that.sourceUrl != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (striplink != null ? !striplink.equals(that.striplink) : that.striplink != null) return false;
        if (tags != null ? !tags.equals(that.tags) : that.tags != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (titleSecond != null ? !titleSecond.equals(that.titleSecond) : that.titleSecond != null) return false;
        return !(topDate != null ? !topDate.equals(that.topDate) : that.topDate != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + odob;
        result = 31 * result + (odobReal != +0.0f ? Float.floatToIntBits(odobReal) : 0);
        result = 31 * result + spam;
        result = 31 * result + (spamReal != +0.0f ? Float.floatToIntBits(spamReal) : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (titleSecond != null ? titleSecond.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + authorId;
        result = 31 * result + authorEid;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (cat != null ? cat.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        result = 31 * result + (link != null ? link.hashCode() : 0);
        result = 31 * result + (striplink != null ? striplink.hashCode() : 0);
        result = 31 * result + imageId;
        result = 31 * result + comments;
        result = 31 * result + comments0;
        result = 31 * result + lastCommentId;
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + wsourceId;
        result = 31 * result + sourceId;
        result = 31 * result + catId;
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + showSite;
        result = 31 * result + clickSite;
        result = 31 * result + showPatrner;
        result = 31 * result + clickPartner;
        result = 31 * result + clickRss;
        result = 31 * result + odobLevel;
        result = 31 * result + mod2Rss;
        result = 31 * result + (date2Rss != null ? date2Rss.hashCode() : 0);
        result = 31 * result + isNomain;
        result = 31 * result + (date2Yrss != null ? date2Yrss.hashCode() : 0);
        result = 31 * result + fulltextId;
        result = 31 * result + type;
        result = 31 * result + isEditorial;
        result = 31 * result + (smiImage != null ? smiImage.hashCode() : 0);
        result = 31 * result + (smiVideo != null ? smiVideo.hashCode() : 0);
        result = 31 * result + (sourceUrl != null ? sourceUrl.hashCode() : 0);
        result = 31 * result + (smiVideoHtml != null ? smiVideoHtml.hashCode() : 0);
        result = 31 * result + (oldWeight != +0.0f ? Float.floatToIntBits(oldWeight) : 0);
        result = 31 * result + isAddcomments;
        result = 31 * result + answerEid;
        result = 31 * result + (int) statusIndex;
        result = 31 * result + partnerId;
        result = 31 * result + (binds != null ? binds.hashCode() : 0);
        result = 31 * result + (isCompetitor ? 1 : 0);
        result = 31 * result + (isDraft ? 1 : 0);
        result = 31 * result + editorOdob;
        result = 31 * result + (editorWeight != +0.0f ? Float.floatToIntBits(editorWeight) : 0);
        result = 31 * result + (lastCommenteffect ? 1 : 0);
        result = 31 * result + (weightComm != +0.0f ? Float.floatToIntBits(weightComm) : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + haveGallery;
        result = 31 * result + odobPositive;
        result = 31 * result + odobNegative;
        result = 31 * result + (paidArticleStatus != null ? paidArticleStatus.hashCode() : 0);
        result = 31 * result + haveSpecialComment;
        result = 31 * result + haveBf;
        result = 31 * result + haveChains;
        result = 31 * result + (isClannews ? 1 : 0);
        result = 31 * result + isHavehistory;
        result = 31 * result + (isBookmark ? 1 : 0);
        result = 31 * result + (lastUpdateTime != null ? lastUpdateTime.hashCode() : 0);
        result = 31 * result + (topDate != null ? topDate.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + adPrice;
        return result;
    }

/*
    public SmiClientsEntity getSmi_clients() {
        return smi_clients;
    }

    public void setSmi_clients(SmiClientsEntity smi_clients) {
        this.smi_clients = smi_clients;
    }
*/
}
