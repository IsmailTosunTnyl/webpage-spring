package net.ismailtosun.Webpage_Spring.service;

import net.ismailtosun.Webpage_Spring.Models.AllData;
import net.ismailtosun.Webpage_Spring.Models.TopSection;
import net.ismailtosun.Webpage_Spring.dao.TopSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllDataService {

    private String lang;
    private TopSection topSection;

    private AllData allData;
    private TopSectionRepository topSectionRepository;

    @Autowired
    public AllDataService(TopSectionRepository topSectionRepository) {
        this.topSectionRepository = topSectionRepository;
    }





    public AllData getAllData(){

        TopSection topSection = topSectionRepository.findById(1).get();

        AllData allData = new AllData(topSection);

        return allData;
    }





}
