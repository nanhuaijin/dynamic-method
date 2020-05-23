package com.breeze.dynamic.method.service.impl;

import com.breeze.dynamic.method.annotation.DynamicMethod;
import com.breeze.dynamic.method.service.DynamicMethodService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author breeze
 * @date 2020/5/23
 */
@Service
public class DynamicMethodServiceImpl {

    //模拟spring容器 - 存放不同实现类对象
    private static Map<String, DynamicMethodService> dynamicMethodMap = new HashMap<>();

    /**
     * 像本地缓存Map中存入不同实现类对象
     * @param code
     * @param dynamicMethodService
     */
    public static void registerHandler(String code, DynamicMethodService dynamicMethodService)
    {
        dynamicMethodMap.put(code, dynamicMethodService);
    }

    /**
     * 根据不同的code获取不同的实现类对象 - 通过本地缓存的方式
     * @param code
     * @return
     */
    public String getDynamicMethodTypeOne(String code) {

        DynamicMethodService dynamicMethodService = dynamicMethodMap.get(code);

        return dynamicMethodService.getDynamicMethod(code);
    }

    /**
     * 根据不同的code获取不同的实现类对象 - 通过反射的方式
     * @param code
     * @return
     */
    @DynamicMethod
    public String getDynamicMethodTypeTwo(String code) {

        code = "o(╥﹏╥)o";

        return code;
    }
}
