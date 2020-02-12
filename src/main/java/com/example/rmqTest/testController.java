package com.example.rmqTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    protected Logger logger = LoggerFactory.getLogger(testController.class.getName());

    @RequestMapping("/hello/{param}")
    public String sendHello(@PathVariable("param") String param) {
        logger.info("testController.sendHello(" + param + ")");
        return "Hello";
    }
}
