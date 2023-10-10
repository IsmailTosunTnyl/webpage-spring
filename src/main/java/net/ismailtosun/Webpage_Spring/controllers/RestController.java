package net.ismailtosun.Webpage_Spring.controllers;

import net.ismailtosun.Webpage_Spring.models.AllData;
import net.ismailtosun.Webpage_Spring.models.ContactForm;
import net.ismailtosun.Webpage_Spring.repository.ContactFormRepository;
import net.ismailtosun.Webpage_Spring.service.AllDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.ismailtosun.Webpage_Spring.interfaces.WebpageAdapter;
@CrossOrigin(maxAge = 3600)
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/webpage")
public class RestController implements WebpageAdapter {

    private AllDataService allDataService;
    private ContactFormRepository contactFormRepository;
    @Autowired
    public RestController(AllDataService allDataService, ContactFormRepository contactFormRepository) {
        this.allDataService = allDataService;
        this.contactFormRepository = contactFormRepository;

    }
    @GetMapping("/hello")
    public String getFire() {
        return "Hello from Spring API!";
    }

    @Override
    @GetMapping("/alldata")
    public AllData getAllData(@RequestHeader(value= "Accept-Language", defaultValue = "en") String lang) {
        AllData allData = allDataService.getAllData(lang);
        System.out.printf("lang: %s\n", lang);
        return allData;
    }

    @Override
    @PostMapping("/contactform")
    public ContactForm saveContactForm(@RequestBody ContactForm contactForm) {


        contactFormRepository.save(contactForm);
        return contactForm;



    }


}
