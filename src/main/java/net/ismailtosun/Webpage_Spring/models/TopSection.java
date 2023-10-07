package net.ismailtosun.Webpage_Spring.models;

import jakarta.persistence.*;

@Entity
@Table(name = "top_section_table")
public class TopSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "hellopromt")
    String hellopromt;



    @Column(name = "myname")
    String myname;

    @Column(name = "mytitle")
    String mytitle;

    public String getLang() {
        return lang;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }

    @Column(name = "lang")
    String lang;

    public TopSection() {
    }

    public TopSection(String hellopromt, String myname, String mytitle, String lang) {
        this.hellopromt = hellopromt;
        this.myname = myname;
        this.mytitle = mytitle;
        this.lang = lang;
    }

    public String getHellopromt() {
        return hellopromt;
    }

    public void setHellopromt(String hellopromt) {
        this.hellopromt = hellopromt;
    }

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    public String getMytitle() {
        return mytitle;
    }

    public void setMytitle(String mytitle) {
        this.mytitle = mytitle;
    }
}
