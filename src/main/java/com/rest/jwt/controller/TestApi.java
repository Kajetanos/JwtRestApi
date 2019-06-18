package com.rest.jwt.controller;

import com.rest.jwt.model.entity.Candy;
import com.rest.jwt.model.repository.CandyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping(path = "/candy", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestApi {

    @Autowired
    CandyRepository candyRepository;
    @GetMapping("/all")
    public Iterable<Candy> test1(){
        System.out.println(candyRepository.findById((long) 1));
        return candyRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Candy> test2(@PathVariable Long id){
        return candyRepository.findById(id);
    }
    @GetMapping("/getName/{id}")
    public Optional<Candy> test3(@PathVariable Long id){
        return candyRepository.findById(id);
    }
}
