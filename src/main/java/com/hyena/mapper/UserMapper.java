package com.hyena.mapper;

import com.hyena.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserMapper {

    @Insert(value = "insert into user_table(user_name,user_email,user_sex) " +
            "        values ( #{name} , #{email} ,#{sex})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty ="id")
    void insertUser(User user);

    @Delete(value = "delete from user_table where user_id=#{id}")
    void deleteUser(@Param("id") Long id);

    @Update(value = "update user_table set user_name =#{username} " +
            "where user_id = #{userid}")
    void updateUser(@Param("username") String username, @Param("userid") int userid);

    @Select(value = "select * from user_table where user_id=#{id};")
    List<User> selectUser(Long id);


}
