package com.scan.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/pk/")
public class ScanInfoController {
    @RequestMapping("getscaninfo/")
    public List<String> getScanInfo(){
        List<String>list = new LinkedList<>();
        list.add("111111");
        list.add("222222");
        list.add("333333");
        return list;
    }
}
