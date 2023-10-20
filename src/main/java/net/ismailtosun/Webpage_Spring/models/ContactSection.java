package net.ismailtosun.Webpage_Spring.models;

import jakarta.persistence.*;

@Entity
@Table(name = "contact_section_table")
public class ContactSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "lang")
    private String lang;

    @Column(name = "contact_title")
    private String contactTitle;

    @Column(name = "contact_subtitle")
    private String contactSubtitle;

    @Column(name = "contact_button")
    private String contactButton;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "contact_subname")
    private String contactSubname;

    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "contact_subemail")
    private String contactSubemail;

    @Column(name = "contact_message")
    private String contactMessage;

    @Column(name = "contact_submessage")
    private String contactSubmessage;


    public String getContactSubname() {
        return contactSubname;
    }

    public void setContactSubname(String contactSubname) {
        this.contactSubname = contactSubname;
    }

    public String getContactSubemail() {
        return contactSubemail;
    }

    public void setContactSubemail(String contactSubemail) {
        this.contactSubemail = contactSubemail;
    }

    public String getContactSubmessage() {
        return contactSubmessage;
    }

    public void setContactSubmessage(String contactSubmessage) {
        this.contactSubmessage = contactSubmessage;
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

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getContactSubtitle() {
        return contactSubtitle;
    }

    public void setContactSubtitle(String contactSubtitle) {
        this.contactSubtitle = contactSubtitle;
    }

    public String getContactButton() {
        return contactButton;
    }

    public void setContactButton(String contactButton) {
        this.contactButton = contactButton;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactMessage() {
        return contactMessage;
    }

    public void setContactMessage(String contactMessage) {
        this.contactMessage = contactMessage;
    }
}
