package com.andressa.udemy;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("${hello.controller.path}")
public class HelloWorldController {

    @Inject
    private  HelloWorldService service;


    @Get("/")
    public String index(){
        return service.sayHi();
    }
}
