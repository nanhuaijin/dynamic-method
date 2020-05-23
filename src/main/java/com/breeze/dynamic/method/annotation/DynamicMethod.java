package com.breeze.dynamic.method.annotation;

import java.lang.annotation.*;

/**
 * @author breeze
 * @date 2020/5/23
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DynamicMethod {
}
