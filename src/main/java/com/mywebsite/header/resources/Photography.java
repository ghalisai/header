package com.mywebsite.header.resources;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class Photography {
     @RequestMapping("/photocontent")
    public String photos()

    {
        return " photos content is getting ready";

    }
}
