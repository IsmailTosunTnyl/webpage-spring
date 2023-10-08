package net.ismailtosun.Webpage_Spring.service;

import net.ismailtosun.Webpage_Spring.models.*;
import net.ismailtosun.Webpage_Spring.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    public AllDataService(TopSectionRepository topSectionRepository, AboutSectionRepository aboutSectionRepository,
                          SelectorSectionRepository selectorSectionRepository, SkillsSectionRepository skillsSectionRepository,
                          RecentWorkSectionRepository recentWorkSectionRepository) {
        this.topSectionRepository = topSectionRepository;
        this.aboutSectionRepository = aboutSectionRepository;
        this.selectorSectionRepository = selectorSectionRepository;
        this.skillsSectionRepository = skillsSectionRepository;
        this.recentWorkSectionRepository = recentWorkSectionRepository;
    }



    public AllData getAllData(String lang){

        TopSection topSection = topSectionRepository.findByLang(lang);
        AboutSection aboutSection = aboutSectionRepository.findByLang(lang);
        SelectorSection selectorSection = selectorSectionRepository.findByLang(lang);
        SkillsSection skillsSection = skillsSectionRepository.findByLang(lang);
        RecentWorkSection recentWorkSection = recentWorkSectionRepository.findByLang(lang);


        AllData allData = new AllData(topSection, aboutSection, selectorSection,skillsSection,recentWorkSection);

        return allData;
    }





}
