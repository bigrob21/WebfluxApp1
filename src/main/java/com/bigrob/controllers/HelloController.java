package com.bigrob.controllers;

import com.bigrob.pojos.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping(value = "/")
    public Mono<ResponseEntity<Message>> sayHello() {
        return Mono.just(ResponseEntity.ok(new Message("Hello World")));
    }

}
