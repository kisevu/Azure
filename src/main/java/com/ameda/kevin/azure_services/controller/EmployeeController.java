package com.ameda.kevin.azure_services.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
*
@author ameda
@project Azure
*
*/
@RestController
@RequestMapping("/api")
public class EmployeeController {


    @GetMapping
    public ResponseEntity<?> getData(){
        return ResponseEntity.ok().body("Kevin you're doing a good job.");
    }

}
