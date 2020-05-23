package com.breeze.dynamic.method.service.impl;

import com.breeze.dynamic.method.consts.AppConst;
import com.breeze.dynamic.method.service.DynamicMethodService;
import org.springframework.stereotype.Service;

/**
 * @author breeze
 * @date 2020/5/23
 */
@Service("booleanPrintImpl")
public class BooleanPrintImpl implements DynamicMethodService {

    /**
     * spring容器初始化会调用无参构造，构造方法调用静态方法，本地缓存Map赋值
     */
    public BooleanPrintImpl() {
        DynamicMethodServiceImpl.registerHandler(AppConst.BOOLEAN_PRINT_METHOD, this);
    }

    @Override
    public String getDynamicMethod(String code) {
        return "打印布尔值对象：true - " + code;
    }
}
