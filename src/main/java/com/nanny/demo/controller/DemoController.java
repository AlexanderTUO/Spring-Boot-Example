package com.nanny.demo.controller;

import com.nanny.demo.biz.DemoBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {
    private DemoBiz demoBiz;

    @Autowired
    DemoController(DemoBiz demoBiz) {
        this.demoBiz = demoBiz;
    }

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public int getDemoInfo() {
        return demoBiz.getCityByPrimaryKey(1).getCol2();
    }
}
