package com.breeze.dynamic.method.service.impl;

import com.breeze.dynamic.method.consts.AppConst;
import com.breeze.dynamic.method.service.DynamicMethodService;
import org.springframework.stereotype.Service;

/**
 * @author breeze
 * @date 2020/5/23
 */
@Service("stringPrintImpl")
public class StringPrintImpl implements DynamicMethodService {

    /**
     * spring容器初始化会调用无参构造，构造方法调用静态方法，本地缓存Map赋值
     */
    public StringPrintImpl() {
        DynamicMethodServiceImpl.registerHandler(AppConst.STRING_PRINT_METHOD, this);
    }

    @Override
    public String getDynamicMethod(String code) {
        return "打印字符串对象：O(∩_∩)O哈哈~ - " + code;
    }
}
