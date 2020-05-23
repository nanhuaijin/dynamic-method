package com.breeze.dynamic.method.service;

/**
 * @author breeze
 * @date 2020/5/23
 */
public interface DynamicMethodService {
    /**
     * 根据不同的code获取不同的实现
     * @param code
     * @return
     */
    String getDynamicMethod(String code);
}
