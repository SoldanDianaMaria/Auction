package com.sda.auction.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Diana Soldan
 * @date : 11/9/2019
 */
@RestController
@RequestMapping("/api/test")
public class Test {

    @GetMapping
    public ResponseEntity<String> get() {
        return new ResponseEntity<> (" Hello World", HttpStatus.OK) ;
    }
}