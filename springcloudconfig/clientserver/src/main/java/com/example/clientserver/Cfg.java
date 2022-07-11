package com.example.clientserver;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@ConfigurationProperties("config-server-client")
@Configuration
@Data
@Service
public class Cfg {

    @Value("${msg}")
    private String msg;

}
