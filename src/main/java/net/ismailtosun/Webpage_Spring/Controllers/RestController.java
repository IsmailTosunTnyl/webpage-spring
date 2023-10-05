package net.ismailtosun.Webpage_Spring.Controllers;

import net.ismailtosun.Webpage_Spring.Models.AllData;
import net.ismailtosun.Webpage_Spring.Models.TopSection;
import net.ismailtosun.Webpage_Spring.service.AllDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import net.ismailtosun.Webpage_Spring.Interfaces.WebpageAdapter;
@CrossOrigin(maxAge = 3600)
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/webpage")
public class RestController implements WebpageAdapter {

    private AllDataService allDataService;
    @Autowired
    public RestController(AllDataService allDataService) {
        this.allDataService = allDataService;
    }
    @GetMapping("/hello")
    public String getFire() {
        return "Hello from Spring API!";
    }

    @Override
    @GetMapping("/alldata")
    public AllData getAllData(@RequestHeader(value= "lang", defaultValue = "en") String lang) {
        AllData allData = allDataService.getAllData();



        return allData;
    }
}
