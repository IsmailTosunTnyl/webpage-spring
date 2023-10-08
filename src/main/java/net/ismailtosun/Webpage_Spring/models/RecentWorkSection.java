package net.ismailtosun.Webpage_Spring.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "recent_work_section_table")
public class RecentWorkSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "lang")
    private String lang;

    @Column(name = "recent_work_title")
    private String recentWorkTitle;

    @Column(name = "recent_work_subtitle")
    private String recentWorkSubtitle;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "lang", referencedColumnName = "lang")
    private List<RecentWorkCard> recentWorkCards;

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

    public String getRecentWorkTitle() {
        return recentWorkTitle;
    }

    public void setRecentWorkTitle(String recentWorkTitle) {
        this.recentWorkTitle = recentWorkTitle;
    }

    public String getRecentWorkSubtitle() {
        return recentWorkSubtitle;
    }

    public void setRecentWorkSubtitle(String recentWorkSubtitle) {
        this.recentWorkSubtitle = recentWorkSubtitle;
    }

    public List<RecentWorkCard> getRecentWorkCards() {
        return recentWorkCards;
    }

    public void setRecentWorkCards(List<RecentWorkCard> recentWorkCards) {
        this.recentWorkCards = recentWorkCards;
    }
}


