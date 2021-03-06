package com.breeze.dynamic.method.controller;

import com.breeze.dynamic.method.service.impl.DynamicMethodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author breeze
 * @date 2020/5/23
 */
@RestController
public class DynamicMethodController {

    @Autowired
    private DynamicMethodServiceImpl dynamicMethodService;

    @GetMapping("/one/{code}")
    public String getDynamicMethodTypeOne(@PathVariable("code") String code) {
        return this.dynamicMethodService.getDynamicMethodTypeOne(code);
    }

    @GetMapping("/two/{code}")
    public String getDynamicMethodTypeTwo(@PathVariable("code") String code) {
        return this.dynamicMethodService.getDynamicMethodTypeTwo(code);
    }

}
