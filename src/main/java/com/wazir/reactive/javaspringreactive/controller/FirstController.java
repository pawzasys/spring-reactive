package com.wazir.reactive.javaspringreactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping("/first")
@RestController
public class FirstController {

    @GetMapping("/string")
    public String getStringValue(){
        return "test-string from FirstController";
    }

    @GetMapping("/mono-string")
    public Mono<String> getMonoStringValue(){
        String str = "test-mono-string from FirstController";
        return Mono.just(str);
    }
}
