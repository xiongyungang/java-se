package com.annotation;

import java.lang.annotation.*;

@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Yungang {
    String test1();

    double test2();
}
