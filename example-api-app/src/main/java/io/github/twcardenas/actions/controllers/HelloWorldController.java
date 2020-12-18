package io.github.twcardenas.actions.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @GetMapping(
            path = "{hello}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addPerson(@PathVariable String hello) {
            return new ResponseEntity<>(hello, HttpStatus.CREATED);
    }
}
