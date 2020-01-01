package com.hyena.service;

import com.hyena.model.User;

import java.util.List;


public interface UserService {

    // insert User
    void insertUser(User user);

    /*
     * provide specific User and its sex
     * change male to female and thus
     * and the User equals should be override
     * */
    void updateUser(String username, int id);

    // delete User , should override equals method of User
    void deleteUser(Long id);

    // select User
    List<User> selectUser(Long id);


    void aopService(Integer i) throws Exception;
}
