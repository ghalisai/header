package com.mywebsite.header.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class AboutModel {

    public int age;
    @Id
    public String name;
    public String job;
    public String place;
     public AboutModel(){

     }


    public AboutModel(String name, int age, String place, String job)
    {
        this.age=age;
        this.place=place;
        this.name=name;
        this.job=job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }



}
