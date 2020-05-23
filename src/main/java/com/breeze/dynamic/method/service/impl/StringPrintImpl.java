package com.breeze.dynamic.method.service.impl;

import com.breeze.dynamic.method.consts.AppConsts;
import com.breeze.dynamic.method.service.DynamicMethodService;
import org.springframework.stereotype.Service;

/**
 * @author breeze
 * @date 2020/5/23
 */
@Service("stringPrintImpl")
public class StringPrintImpl implements DynamicMethodService {

    public StringPrintImpl() {
        DynamicMethodServiceImpl.registerHandler(AppConsts.STRING_PRINT_METHOD, this);
    }

    @Override
    public String getDynamicMethod(String code) {
        return "打印字符串对象：O(∩_∩)O哈哈~";
    }
}
