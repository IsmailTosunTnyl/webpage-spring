package net.ismailtosun.Webpage_Spring.models;

import jakarta.persistence.*;

@Entity
@Table(name = "recent_work_card_table")
public class RecentWorkCard {
    public RecentWorkCard() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "lang")
    private String lang;
    @Column(name = "recent_work_card_title")
    private String recentWorkCardTitle;
    @Column(name = "recent_work_card_text")
    private String recentWorkCardText;
    @Column(name = "recent_work_card_button")
    private String recentWorkCardButton;
    @Column(name = "recent_work_card_link")
    private String recentWorkCardLink;

    @Column(name = "recent_work_card_image")
    private String recentWorkCardImage;

    public RecentWorkCard(int id, String lang, String recentWorkCardTitle, String recentWorkCardText, String recentWorkCardButton, String recentWorkCardLink) {
        this.id = id;
        this.lang = lang;
        this.recentWorkCardTitle = recentWorkCardTitle;
        this.recentWorkCardText = recentWorkCardText;
        this.recentWorkCardButton = recentWorkCardButton;
        this.recentWorkCardLink = recentWorkCardLink;
    }

    public String getRecentWorkCardImage() {
        return recentWorkCardImage;
    }

    public void setRecentWorkCardImage(String recentWorkCardImage) {
        this.recentWorkCardImage = recentWorkCardImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getRecentWorkCardTitle() {
        return recentWorkCardTitle;
    }

    public void setRecentWorkCardTitle(String recentWorkCardTitle) {
        this.recentWorkCardTitle = recentWorkCardTitle;
    }

    public String getRecentWorkCardText() {
        return recentWorkCardText;
    }

    public void setRecentWorkCardText(String recentWorkCardText) {
        this.recentWorkCardText = recentWorkCardText;
    }

    public String getRecentWorkCardButton() {
        return recentWorkCardButton;
    }

    public void setRecentWorkCardButton(String recentWorkCardButton) {
        this.recentWorkCardButton = recentWorkCardButton;
    }

    public String getRecentWorkCardLink() {
        return recentWorkCardLink;
    }

    public void setRecentWorkCardLink(String recentWorkCardLink) {
        this.recentWorkCardLink = recentWorkCardLink;
    }
}
