package com.example.clientserver;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MicroserviceController {


    private final Cfg configuration;



    @GetMapping("/endpoint")
    public String retrieveValue() {
        return configuration.getMsg();
    }
}
