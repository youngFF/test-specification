package com.hyena.service.serviceImpl;

import com.hyena.mapper.UserMapper;
import com.hyena.model.User;
import com.hyena.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;

    @Override
    public void insertUser(User user) {
        mapper.insertUser(user);
    }

    /**
     * 通过用户id，更新用户名称
     *
     * @param username 用户名称
     * @param id  用户id
     *
     * @see UserMapper
     * @see UserMapper#updateUser(String, int)
     * @see
     */
    @Override
    public void updateUser(String username, int id) {
        mapper.updateUser(username, id);
    }

    @Override
    public void deleteUser(Long id) {
        mapper.deleteUser(id);
    }

    @Override
    public List<User> selectUser(Long id) {
        return mapper.selectUser(id);
    }


    public void aopService(Integer i) {
        System.out.println(i);
    }
}
