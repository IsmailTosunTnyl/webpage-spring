package net.ismailtosun.Webpage_Spring.models;

import jakarta.persistence.*;

@Entity
@Table(name = "contact_form_table")
public class ContactForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "contact_message")
    private String contactMessage;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
