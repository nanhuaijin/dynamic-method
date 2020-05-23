package com.breeze.dynamic.method.service.impl;

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

    //存放不同实现类对象
    private static Map<String, DynamicMethodService> dynamicMethodMap = new HashMap<>();

    public static void registerHandler(String code, DynamicMethodService dynamicMethodService)
    {
        dynamicMethodMap.put(code, dynamicMethodService);
    }

    /**
     * 根据不同的code获取不同的实现类对象
     * @param code
     * @return
     */
    public String getDynamicMethod(String code) {

        DynamicMethodService dynamicMethodService = dynamicMethodMap.get(code);

        return dynamicMethodService.getDynamicMethod(code);
    }
}
