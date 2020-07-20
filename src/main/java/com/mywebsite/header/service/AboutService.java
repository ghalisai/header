package com.mywebsite.header.service;

import com.mywebsite.header.repository.AboutRepository;

import com.mywebsite.header.model.AboutModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AboutService {

    @Autowired
    private AboutRepository about;

    


    public List<AboutModel> aboutMe(){

        List<AboutModel> p = new ArrayList<>();
        about.findAll().forEach(p::add);
        return  p;

    }


    public void addOne(AboutModel model) {
                 about.save(model);
    }

    public void updateData(String id, AboutModel model) {
        about.save(model);
            }



                    public void delRecord(String id) {
                   about.deleteById(id);

    }
}



