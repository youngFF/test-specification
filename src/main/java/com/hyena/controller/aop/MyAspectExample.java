package com.hyena.controller.aop;

import com.google.gson.Gson;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 这个切面主要是学习切点表达式的写法
 */
@Aspect
@Component
public class MyAspectExample {

    @Autowired
    private Gson gson ;

    /**
     * 切到某一个类的方法
     * Test: positive
     */
    @Pointcut("execution(* com.hyena.service.serviceImpl.AopServiceImpl.methodA())")
    private void pointCutA() {}


    /**
     * 切到某一个类下的所有方法
     * Test: positive
     */
    @Pointcut("execution(* com.hyena.service.serviceImpl.AopServiceImpl.*(..))")
    private void pointCutB() {}


    /**
     * 切到方法上标有某个注解的方法
     */
    @Pointcut("@annotation(org.springframework.transaction.annotation.Transactional)")
    private void pointCutC() {}


    /**
     * 切到特定的方法名称
     */
    @Pointcut("execution(* *User(..))")
    private void pointCutD() {}

    /**
     * 匹配某个类产生的代理对象是com.hyena.service.serviceImpl.AopServiceImpl的实例
     */
    @Pointcut("this(com.hyena.service.serviceImpl.AopServiceImpl)")
    private void pointE() {}

    /**
     * 匹配com.hyena子包下的所有类
     */
    @Pointcut("within(com.hyena.*)")
    private void pointCutF() {

    }


    /**
     * 前置通知：打印方法参数
     *
     * @param joinPoint
     */
    @Before("pointCutF()")
    public void before(JoinPoint joinPoint) {
        // 获取方法名称的全限定名
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getName();

        // 获取参数列表
        Object[] args = joinPoint.getArgs();

        for (Object arg : args) {
            System.out.println("Class: " + arg.getClass().getName() +"  value: " + arg);
        }
        System.out.println("method name: " + className+"."+methodName +  " args list: " + gson.toJson(args));
        System.out.println("MyAspect2 before advice");
    }


}
