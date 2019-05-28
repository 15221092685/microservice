package com.cloud.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class WebtestApplication implements ApplicationListener<WebServerInitializedEvent> {
    private static int serverPort;
    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        this.serverPort = webServerInitializedEvent.getWebServer().getPort();
    }

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(WebtestApplication.class);

        SpringApplication.run(WebtestApplication.class, args);
        try {
            log.info("ip地址<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+ InetAddress.getLocalHost()+":"+serverPort
            );
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }


}
