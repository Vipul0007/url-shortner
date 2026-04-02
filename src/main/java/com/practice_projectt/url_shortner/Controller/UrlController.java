package com.practice_projectt.url_shortner.Controller;

import com.practice_projectt.url_shortner.Model.UrlMapping;
import com.practice_projectt.url_shortner.Repository.CRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class UrlController {
    @Autowired
    CRUDRepository cr;

    @PostMapping("/post-url")
    @ResponseBody
    public String postUrl(String url){

        UrlMapping obj = new UrlMapping();
        obj.setMain_url(url);
        cr.save(obj);
        System.out.println(obj.getId());
        String temp = Integer.toString(obj.getId());
        obj.setShort_url(temp);
        cr.save(obj);
        System.out.println(obj.toString());
        return "URL IS SAVED";
    }

    @GetMapping("/")
    @ResponseBody
    public String getUrl(@RequestParam String url){
        UrlMapping obj = cr.findByMainUrl(url);
        if(obj == null)
            return "No short url for the given url";
        return "{ redirect-url : /" + obj.getShort_url() +" }";
    }
}
