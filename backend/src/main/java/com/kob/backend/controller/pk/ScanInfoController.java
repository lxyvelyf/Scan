package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ScanInfoController {
    @RequestMapping("/pk/getscaninfo/")
    public Map<String,String> getScanInfo(){
        Map<String,String> bot1 = new HashMap<>();
        bot1.put("name","bot");
        bot1.put("rating","1500");
        return bot1;
    }
}
