package com.hyena.service.serviceImpl;

import com.hyena.annotation.LogParameters;
import com.hyena.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AopServiceImpl {


    public void methodA() {
        System.out.println("AopServiceImpl methodA");
    }

    @Transactional(rollbackFor = Exception.class)
    public String methodB(String expect) {
        return expect;
    }


    @LogParameters
    public void methodC(Integer a, Integer b) {
        System.out.println("result : " + (a + b));
    }


    @LogParameters
    public void methodD(User user) {}
}
