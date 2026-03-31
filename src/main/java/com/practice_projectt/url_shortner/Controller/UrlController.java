package com.practice_projectt.url_shortner.Controller;

import com.practice_projectt.url_shortner.Model.UrlMapping;
import com.practice_projectt.url_shortner.Repository.CRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UrlController {
    @Autowired
    CRUDRepository cr;

    @PostMapping("/post-url")
    @ResponseBody
    public String postUrl(String url){

        UrlMapping obj = new UrlMapping();
        obj.setMain_url(url);
        String temp = Integer.toString(obj.getId());
        obj.setShort_url(temp);
        System.out.println(obj.toString());
        cr.save(obj);
        return "URL IS SAVED";
    }
}
