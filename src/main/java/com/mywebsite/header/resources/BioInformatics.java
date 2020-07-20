package com.mywebsite.header.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BioInformatics {

    @RequestMapping("/bioinfo")
     public String bioinformatics()
    {
        return "bionformatics is getting ready";
    }
}
