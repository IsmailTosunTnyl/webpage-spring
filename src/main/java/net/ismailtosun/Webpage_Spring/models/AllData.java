package net.ismailtosun.Webpage_Spring.models;

public class AllData {
    TopSection topSection;
    AboutSection aboutSection;
    SelectorSection selectorSection;

    public AllData(TopSection topSection, AboutSection aboutSection,SelectorSection selectorSection) {
        this.topSection = topSection;
        this.aboutSection = aboutSection;
        this.selectorSection = selectorSection;
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
}
