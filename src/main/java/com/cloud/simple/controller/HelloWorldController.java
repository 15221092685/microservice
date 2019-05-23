package com.cloud.simple.controller;

import com.cloud.simple.constant.ConstantUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ConstantUtils.HELLO_URL+ConstantUtils.VERSION)
public class HelloWorldController {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String sout() {
        logger.info("日志打印<<<<<<<<<<<<<<<,");
        System.out.println("进入方法<<<<<<<<<<<<<<<<<");
        return "hello world" ;
    }

}
