package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AnalyzerController {
    private final Logger LOG = LoggerFactory.getLogger(AnalyzerController.class);

    @RequestMapping(value={"","/start"})
    public String start(){
        LOG.info("*******views/index.jsp******");
        return "views/index";
    }
    @RequestMapping(value="/index.do")
    public String index(){
        LOG.info("*******index/index.jsp******");
        return "index/index";
    }
//    @RequestMapping(value="/mqttclient")
//    public String mqttclient(){
//        return "mqttclient";
//    }

    @RequestMapping(value="/mqtt")
    public String mqtt() {
        return "mqtt";

    }
}
