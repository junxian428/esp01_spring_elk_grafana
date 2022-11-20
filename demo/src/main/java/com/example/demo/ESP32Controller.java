package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/esp32")
public class ESP32Controller {


    @PostMapping("/data")
    public String postBody(@RequestBody String fullName) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data received: " + fullName);
        log.info("Data received: " + fullName  + "Time : " + localDateTime);
        return "Hello " + fullName;
    }

}
