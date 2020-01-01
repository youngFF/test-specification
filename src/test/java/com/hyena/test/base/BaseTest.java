package com.hyena.test.base;


import com.google.gson.Gson;
import lombok.extern.log4j.Log4j;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * BaseTest：
 *
 * 加载Spring配置文件，启动Spring容器，配置Gson
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-container.xml",
        "classpath:spring/spring-mvc.xml"})
@Log4j
@Transactional("transactionManager")
public abstract class BaseTest {

    @Autowired
    protected Gson gson;

    /**
     * result to be assigned
     */
    protected Object result;

    @After
    public void printJson() {
        String clazzName = getClass().getName();

        log.info("result : " + gson.toJson(result));
    }

}


