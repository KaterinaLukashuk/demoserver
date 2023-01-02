package org.example.web;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class UserController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
