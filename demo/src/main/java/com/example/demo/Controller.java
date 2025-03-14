package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("demo")
    public Mono<String> greeting(){
        return computeMessage()
                .zipWith(getNameFromDB())
                .map(value ->{
                    return value.getT1() + value.getT2();
                });
    }

    private Mono<String>getNameFromDB() {
        return Mono.just(" Supriya").delayElement(Duration.ofSeconds(5));
    }

    public Mono<String> computeMessage(){
        return  Mono.just("Hello").delayElement(Duration.ofSeconds(5));
    }
}
