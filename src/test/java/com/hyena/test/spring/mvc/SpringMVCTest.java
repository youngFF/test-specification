package com.hyena.test.spring.mvc;


import com.hyena.service.UserService;
import com.hyena.test.base.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 测试Spring MVC，主要是从Controller -》Service-》DAO 的一个逻辑结构
 */
@WebAppConfiguration
public class SpringMVCTest extends BaseTest {

    private MockMvc mock;

    @Autowired
    private WebApplicationContext wc;

    /**
     * service injected
     */
    @Autowired
    private UserService service;

    @Before
    public void setupWC() {
        mock = MockMvcBuilders.webAppContextSetup(wc).build();
    }

    @Test
    public void mockWebInsert() throws Exception {
        mock.perform(MockMvcRequestBuilders.get("/insert", "1", "2",
                "3"));
    }


}
