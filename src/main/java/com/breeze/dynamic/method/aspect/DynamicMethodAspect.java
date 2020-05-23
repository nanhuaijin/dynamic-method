package com.breeze.dynamic.method.aspect;

import com.alibaba.fastjson.JSONObject;
import com.breeze.dynamic.method.consts.AppConst;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author breeze
 * @date 2020/5/23
 */
@Aspect
@Component
public class DynamicMethodAspect {


    @Around("@annotation(com.breeze.dynamic.method.annotation.DynamicMethod)")
    public Object dynamicMethodAspect(ProceedingJoinPoint joinPoint) throws Throwable{

        //最终返回结果
        Object result = null;
        //获取连接点签名
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //获取方法参数
        Object[] args = joinPoint.getArgs();
        Object code = args[0];

        //通过反射的方式获取对象
        Class<?> dynamicMethod = null;
        if (code.equals(AppConst.BOOLEAN_PRINT_METHOD)) {
            dynamicMethod = Class.forName(AppConst.BOOLEAN_PRINT_METHOD_NAME);
        } else if (code.equals(AppConst.INTEGER_PRINT_METHOD)) {
            dynamicMethod = Class.forName(AppConst.INTEGER_PRINT_METHOD_NAME);
        }else if (code.equals(AppConst.STRING_PRINT_METHOD)) {
            dynamicMethod = Class.forName(AppConst.STRING_PRINT_METHOD_NAME);
        }

        Method getDynamicMethod = dynamicMethod.getDeclaredMethod("getDynamicMethod", String.class);
        Object invoke = getDynamicMethod.invoke(dynamicMethod.newInstance(), code);

        //执行原方法
        result = joinPoint.proceed(args);

        return result + invoke.toString();
    }
}
