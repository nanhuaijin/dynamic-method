package com.breeze.dynamic.method.service.impl;

import com.breeze.dynamic.method.consts.AppConsts;
import com.breeze.dynamic.method.service.DynamicMethodService;
import org.springframework.stereotype.Service;

/**
 * @author breeze
 * @date 2020/5/23
 */
@Service("integerPrintImpl")
public class IntegerPrintImpl implements DynamicMethodService {

    public IntegerPrintImpl() {
        DynamicMethodServiceImpl.registerHandler(AppConsts.INTEGER_PRINT_METHOD, this);
    }

    @Override
    public String getDynamicMethod(String code) {
        return "打印数字对象：20200523";
    }
}
