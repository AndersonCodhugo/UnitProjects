package com.firstapp.unitspring.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldSerivce {

    @GetMapping
    public String paginaInicial() {
        return "<a href=\"http://localhost:8080/hello\">Hello</a>";
    }


    @GetMapping("/hello")
    public String sayHello() {
        return "<h1> Hello World!</h1>";
    }

    @GetMapping("/ola")
    public String digaOla() {
        return "<h1> Olá Mundo!</h1>";
    }
}
