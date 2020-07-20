package com.mywebsite.header.repository;


import com.mywebsite.header.model.AboutModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface AboutRepository extends CrudRepository<AboutModel, String> {



}
