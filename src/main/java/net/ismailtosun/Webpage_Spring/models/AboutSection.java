package net.ismailtosun.Webpage_Spring.models;

import jakarta.persistence.*;

@Entity
@Table(name = "about_section_table")
public class AboutSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "lang")
    private String lang;

    @Column(name = "about_title")
    private String aboutTitle;

    @Column(name = "about_text")
    private String aboutText;

    @Column(name = "about_hireme_button")
    private String aboutHiremeButton;

    @Column(name = "about_download_button")
    private String aboutDownloadButton;

    @Column(name = "about_download_link")
    private String aboutDownloadLink;


    public AboutSection() {
    }

    public AboutSection(int id, String lang, String aboutTitle, String aboutText,
                        String aboutHiremeButton, String aboutDownloadButton, String aboutDownloadLink) {
        this.id = id;
        this.lang = lang;
        this.aboutTitle = aboutTitle;
        this.aboutText = aboutText;
        this.aboutHiremeButton = aboutHiremeButton;
        this.aboutDownloadButton = aboutDownloadButton;
        this.aboutDownloadLink = aboutDownloadLink;
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

    public String getAboutTitle() {
        return aboutTitle;
    }

    public void setAboutTitle(String aboutTitle) {
        this.aboutTitle = aboutTitle;
    }

    public String getAboutText() {
        return aboutText;
    }

    public void setAboutText(String aboutText) {
        this.aboutText = aboutText;
    }

    public String getAboutHiremeButton() {
        return aboutHiremeButton;
    }

    public void setAboutHiremeButton(String aboutHiremeButton) {
        this.aboutHiremeButton = aboutHiremeButton;
    }

    public String getAboutDownloadButton() {
        return aboutDownloadButton;
    }

    public void setAboutDownloadButton(String aboutDownloadButton) {
        this.aboutDownloadButton = aboutDownloadButton;
    }

    public String getAboutDownloadLink() {
        return aboutDownloadLink;
    }

    public void setAboutDownloadLink(String aboutDownloadLink) {
        this.aboutDownloadLink = aboutDownloadLink;
    }
}
