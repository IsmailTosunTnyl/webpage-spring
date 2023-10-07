package net.ismailtosun.Webpage_Spring.models;

import jakarta.persistence.*;

@Entity
@Table(name = "selector_section_table")
public class SelectorSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;


    @Column(name = "lang")
    String lang;

    @Column(name = "selector_title")
    String selectorTitle;

    @Column(name = "selector_subtitle")
    String selectorSubtitle;

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

    public String getSelectorTitle() {
        return selectorTitle;
    }

    public void setSelectorTitle(String selectorTitle) {
        this.selectorTitle = selectorTitle;
    }

    public String getSelectorSubtitle() {
        return selectorSubtitle;
    }

    public void setSelectorSubtitle(String selectorSubtitle) {
        this.selectorSubtitle = selectorSubtitle;
    }
}
