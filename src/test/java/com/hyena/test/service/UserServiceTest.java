package com.hyena.test.service;

import com.hyena.model.User;
import com.hyena.service.UserService;
import com.hyena.test.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

/**
 * 测试目标：测试UserService里面的方法正确性
 *
 * @author yangxingdong
 */
public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;


    // ---------- insertUser unite -----------//

    /**
     * 需求：写测试规范
     * 测试目标：插入用户
     * 测试数据：
     *      name jack
     *      email hyena@jd.com
     *      sex 1
     * 测试结果: positive 成功写入
     *
     * 注意：mysql-connector-java的版本要8.0.11
     */
    @Test
    public void insertUserTest1() {
        User user = User.builder()
                .email("hyena@jd.com")
                .sex(1)
                .name("jack")
                .build();
        userService.insertUser(user);
    }

    /**
     * 需求：写测试规范
     * 测试目标：对于插入数据使用@Rollback不提交事务
     * 测试数据：
     *      name jack
     *      email hyena@jd.com
     *      sex 1
     * 测试结果: negative
     *         只是在测试方法上添加@Rollback注解并不能使事务进行回滚
     */
    @Test
    @Rollback
    public void insertUserTest2() {
        User user = User.builder()
                .email("hyena@jd.com")
                .sex(1)
                .name("jack")
                .build();
        userService.insertUser(user);
    }


    /**
     * 需求：写测试规范
     * 测试目标：对于插入数据使用@Rollback不提交事务
     * 测试数据：
     *      name jack
     *      email hyena@jd.com
     *      sex 1
     * 测试结果: positive
     *         由于@Rollback是spring注解，所以需要Spring的事务管理器的支持，需要配置Spring事务管理器
     *
     */
    @Test
    @Rollback
    public void insertUserTest3() {
        User user = User.builder()
                .email("hyena@jd.com")
                .sex(1)
                .name("jack")
                .build();
        userService.insertUser(user);
    }

    // ---------- insertUser unite end -----------//

}
