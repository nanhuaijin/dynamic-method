package com.breeze.dynamic.method.service.impl;

import com.breeze.dynamic.method.consts.AppConsts;
import com.breeze.dynamic.method.service.DynamicMethodService;
import org.springframework.stereotype.Service;

/**
 * @author breeze
 * @date 2020/5/23
 */
@Service("booleanPrintImpl")
public class BooleanPrintImpl implements DynamicMethodService {

    public BooleanPrintImpl() {
        DynamicMethodServiceImpl.registerHandler(AppConsts.BOOLEAN_PRINT_METHOD, this);
    }

    @Override
    public String getDynamicMethod(String code) {
        return "打印布尔值对象：true";
    }
}
