package net.ismailtosun.Webpage_Spring.service;

import net.ismailtosun.Webpage_Spring.models.*;
import net.ismailtosun.Webpage_Spring.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AllDataService {

    private String lang;
    private TopSection topSection;

    private AllData allData;
    private TopSectionRepository topSectionRepository;
    private AboutSectionRepository aboutSectionRepository;
    private SelectorSectionRepository selectorSectionRepository;
    private SkillsSectionRepository skillsSectionRepository;
    private RecentWorkSectionRepository recentWorkSectionRepository;
    private ContactSectionRepository contactSectionRepository;
    private Metadata metadata;

    @Value("${spring.app.version}")
    private String appVersion;

    @Autowired
    public AllDataService(TopSectionRepository topSectionRepository, AboutSectionRepository aboutSectionRepository,
                          SelectorSectionRepository selectorSectionRepository, SkillsSectionRepository skillsSectionRepository,
                          RecentWorkSectionRepository recentWorkSectionRepository, ContactSectionRepository contactSectionRepository) {
        this.topSectionRepository = topSectionRepository;
        this.aboutSectionRepository = aboutSectionRepository;
        this.selectorSectionRepository = selectorSectionRepository;
        this.skillsSectionRepository = skillsSectionRepository;
        this.recentWorkSectionRepository = recentWorkSectionRepository;
        this.contactSectionRepository = contactSectionRepository;
    }


    public AllData getAllData(String lang) {
        System.out.println("lang = " + lang);
        TopSection topSection = topSectionRepository.findByLang(lang);

        AboutSection aboutSection = aboutSectionRepository.findByLang(lang);
        SelectorSection selectorSection = selectorSectionRepository.findByLang(lang);
        SkillsSection skillsSection = skillsSectionRepository.findByLang(lang);
        RecentWorkSection recentWorkSection = recentWorkSectionRepository.findByLang(lang);
        ContactSection contactSection = contactSectionRepository.findByLang(lang);

        System.out.println("topSection = " + topSection.getLang());
        return new AllData(topSection, aboutSection, selectorSection,
                skillsSection, recentWorkSection, contactSection, new Metadata(lang, "MySQL", appVersion));


    }


}
