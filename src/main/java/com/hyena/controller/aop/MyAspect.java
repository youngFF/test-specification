package com.hyena.controller.aop;


import com.google.gson.Gson;
import lombok.extern.log4j.Log4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Log4j
public class MyAspect {


    @Autowired
    private Gson gson ;

    @Pointcut("@annotation(com.hyena.annotation.LogParameters)")
    private void pointCutA() {
    }


    @Around("pointCutA()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        /**
         * 注意：当使用Around时候，如果方法会抛出异常，则不会执行afterThrowing
         *      如果在Around-Advice执行方法，则会执行before-advice
         *
         * JoinPoint就是获取匹配的连接点信息，即方法信息
         * ProceedJoinPoint在JoinPoint基础上，添加了proceed过程，用于执行JoinPoint
         */

        Object[] params = proceedingJoinPoint.getArgs();
        Signature signature = proceedingJoinPoint.getSignature();
        String declaringTypeName = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        String json = gson.toJson(params);
        String msg = declaringTypeName + "."+ methodName +  ":" + json;

        log.info(msg);

    }
}
