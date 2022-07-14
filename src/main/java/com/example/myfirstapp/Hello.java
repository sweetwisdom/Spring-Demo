package com.example.myfirstapp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Value("${person.name}")
    private String name;
    @RequestMapping("/hello")
    public  String hello(){
        System.out.println(name);

        return  "hello Spring Boot !";
    }
    @RequestMapping("/test")
    public String test(@RequestParam Integer id) {
//        get 参数

        System.out.println(id);
        return id.toString();
    }


}
