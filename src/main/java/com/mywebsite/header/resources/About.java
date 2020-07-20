package com.mywebsite.header.resources;

import com.mywebsite.header.model.AboutModel;
import com.mywebsite.header.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class About {

    @Autowired
    private AboutService aboutService;
    @RequestMapping("/abtme")
    public List<AboutModel> sayHi()
    {
        return aboutService.aboutMe();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/abtme")
    public void addDetails(@RequestBody AboutModel model) {
        aboutService.addOne(model);
    }
        @RequestMapping(method = RequestMethod.PUT, value="/abtme/{id}")
        public void updateData(@RequestBody AboutModel model, @PathVariable String id){

                       aboutService.updateData(id, model);
        }
        @RequestMapping(method = RequestMethod.DELETE, value="/abtme/{id}")
        public void delDetails(@PathVariable String id){
            aboutService.delRecord(id);

        }

    }


