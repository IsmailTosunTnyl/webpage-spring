package net.ismailtosun.Webpage_Spring.service;

import net.ismailtosun.Webpage_Spring.models.AboutSection;
import net.ismailtosun.Webpage_Spring.models.AllData;
import net.ismailtosun.Webpage_Spring.models.SelectorSection;
import net.ismailtosun.Webpage_Spring.models.TopSection;
import net.ismailtosun.Webpage_Spring.repository.AboutSectionRepository;
import net.ismailtosun.Webpage_Spring.repository.SelectorSectionRepository;
import net.ismailtosun.Webpage_Spring.repository.TopSectionRepository;
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

    @Autowired
    public AllDataService(TopSectionRepository topSectionRepository, AboutSectionRepository aboutSectionRepository, SelectorSectionRepository selectorSectionRepository) {
        this.topSectionRepository = topSectionRepository;
        this.aboutSectionRepository = aboutSectionRepository;
        this.selectorSectionRepository = selectorSectionRepository;
    }



    public AllData getAllData(String lang){

        TopSection topSection = topSectionRepository.findByLang(lang);
        AboutSection aboutSection = aboutSectionRepository.findByLang(lang);
        SelectorSection selectorSection = selectorSectionRepository.findByLang(lang);

        AllData allData = new AllData(topSection, aboutSection, selectorSection);

        return allData;
    }





}
