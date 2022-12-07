package org1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
 @GetMapping("/index/{id}")
    public String hello(@PathVariable String id)
 {
     return id + "!";
 }
}
