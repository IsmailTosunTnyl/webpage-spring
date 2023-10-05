package net.ismailtosun.Webpage_Spring.Controllers;

import net.ismailtosun.Webpage_Spring.Models.AllData;
import net.ismailtosun.Webpage_Spring.Models.TopSection;
import org.springframework.web.bind.annotation.*;
import net.ismailtosun.Webpage_Spring.Interfaces.WebpageAdapter;
@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/firebase")
public class RestFireController implements WebpageAdapter {

    @GetMapping("/hello")
    public String getFire() {
        return "Hello from Firebase!";
    }

    @Override
    @GetMapping("/alldata")
    public AllData getAllData(@RequestHeader(value= "lang", defaultValue = "en") String lang) {
        AllData allData;
        switch (lang) {
            case "en":
                allData  = new AllData(new TopSection("Hello", "Ismail Tosun", "Software Engineer"));
                break;
            case "tr":
                allData  = new AllData(new TopSection("Selam", "Ismail Tosun", "Bilgisayar Mühendisi"));
                break;
            default:
                allData  = new AllData(new TopSection("Hello", "Ismail Tosun", "Software Engineer"));
        break;
        }
        return allData;
    }
}
