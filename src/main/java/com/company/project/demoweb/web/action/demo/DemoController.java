package com.company.project.demoweb.web.action.demo;

import com.company.project.demoweb.support.web.annotation.Api;
import com.company.project.demoweb.support.web.annotation.PostMapping;

import java.util.Map;

@Api
public class DemoController {

    @PostMapping("/demo1")
    public Map<String, Object> demo1() {
        System.out.println("aaaaaaaaaaaaa");

        return null;
    }

    @PostMapping("/demo2")
    public Map<String, Object> demo2() {
        System.out.println("bbbbbbbbbbb");

        return null;
    }
}
