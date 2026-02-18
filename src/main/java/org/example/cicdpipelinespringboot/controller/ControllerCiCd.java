package org.example.cicdpipelinespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerCiCd {

    @GetMapping("/user")
    String viewDetails(){
        return "this is the simple rest api";
    }

}
