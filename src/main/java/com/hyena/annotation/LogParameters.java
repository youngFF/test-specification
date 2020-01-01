package com.hyena.annotation;

import java.lang.annotation.*;


/**
 * 对所有标记这个注解的打印入参信息
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.METHOD)
@Loggable
public @interface LogParameters {

}
