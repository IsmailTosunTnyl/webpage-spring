package net.ismailtosun.Webpage_Spring.models;

public class AllData {
    private TopSection topSection;
    private AboutSection aboutSection;
    private SelectorSection selectorSection;
    private SkillsSection skillsSection;
    private RecentWorkSection recentWorkSection;

    private ContactSection contactSection;

    public AllData(TopSection topSection, AboutSection aboutSection,SelectorSection selectorSection,
                   SkillsSection skillsSection,RecentWorkSection recentWorkSection,ContactSection contactSection) {
        this.topSection = topSection;
        this.aboutSection = aboutSection;
        this.selectorSection = selectorSection;
        this.skillsSection = skillsSection;
        this.recentWorkSection = recentWorkSection;
        this.contactSection = contactSection;
    }

    public TopSection getTopSection() {
        return topSection;
    }


    public void setTopSection(TopSection topSection) {
        this.topSection = topSection;
    }

    public AboutSection getAboutSection() {
        return aboutSection;
    }

    public void setAboutSection(AboutSection aboutSection) {
        this.aboutSection = aboutSection;
    }

    public SelectorSection getSelectorSection() {
        return selectorSection;
    }

    public void setSelectorSection(SelectorSection selectorSection) {
        this.selectorSection = selectorSection;
    }

    public SkillsSection getSkillsSection() {
        return skillsSection;
    }

    public void setSkillsSection(SkillsSection skillsSection) {
        this.skillsSection = skillsSection;
    }

    public RecentWorkSection getRecentWorkSection() {
        return recentWorkSection;
    }

    public void setRecentWorkSection(RecentWorkSection recentWorkSection) {
        this.recentWorkSection = recentWorkSection;
    }

    public ContactSection getContactSection() {
        return contactSection;
    }

    public void setContactSection(ContactSection contactSection) {
        this.contactSection = contactSection;
    }
}
