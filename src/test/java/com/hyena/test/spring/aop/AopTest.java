package com.hyena.test.spring.aop;

import com.hyena.model.User;
import com.hyena.service.serviceImpl.AopServiceImpl;
import com.hyena.test.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * 主要测试切点表达式的各个写法。
 *
 */
public class AopTest extends BaseTest {


    @Autowired
    private AopServiceImpl aopService;

    @Autowired
    private ApplicationContext context;


    /**
     * 测试切点表达式是否写的正确
     */
    @Test
    public void pointCutTest() {
        aopService.methodB("hello world");
    }


    /**
     * 测试具有自定义注解的切点表达式
     */
    @Test
    public void annotatedMehtodPointCutTest() {
        User user = User.builder()
                .email("XXX@jd.com")
                .name("hyena")
                .sex(1).build();

        aopService.methodD(user);
    }





}
