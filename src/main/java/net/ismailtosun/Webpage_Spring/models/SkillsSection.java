package net.ismailtosun.Webpage_Spring.models;

import jakarta.persistence.*;

@Entity
@Table(name = "skills_section_table")
public class SkillsSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "lang")
    String lang;

    @Column(name = "skills_title")
    String skillsTitle;

    @Column(name = "skills_subtitle")
    String skillsSubtitle;

    @Column(name = "skill_one")
    String skillOne;

    @Column(name = "skill_two")
    String skillTwo;

    @Column(name = "skill_three")
    String skillThree;

    @Column(name = "skill_four")
    String skillFour;

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

    public String getSkillsTitle() {
        return skillsTitle;
    }

    public void setSkillsTitle(String skillsTitle) {
        this.skillsTitle = skillsTitle;
    }

    public String getSkillsSubtitle() {
        return skillsSubtitle;
    }

    public void setSkillsSubtitle(String skillsSubtitle) {
        this.skillsSubtitle = skillsSubtitle;
    }

    public String getSkillOne() {
        return skillOne;
    }

    public void setSkillOne(String skillOne) {
        this.skillOne = skillOne;
    }

    public String getSkillTwo() {
        return skillTwo;
    }

    public void setSkillTwo(String skillTwo) {
        this.skillTwo = skillTwo;
    }

    public String getSkillThree() {
        return skillThree;
    }

    public void setSkillThree(String skillThree) {
        this.skillThree = skillThree;
    }

    public String getSkillFour() {
        return skillFour;
    }

    public void setSkillFour(String skillFour) {
        this.skillFour = skillFour;
    }
}
