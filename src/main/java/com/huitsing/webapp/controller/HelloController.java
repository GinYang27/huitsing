package com.huitsing.webapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
    public String index() {
        return "This is the first version of this website, where the dream starts off. - Jin";
    }
}
