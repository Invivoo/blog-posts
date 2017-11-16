package com.projet.springsecurity.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SpringSecurityController {


    @GetMapping
    public ResponseEntity<String> getUser(){

        return  new ResponseEntity<String>("Authenticated", HttpStatus.OK);
    }

}
