package com.hyena.model;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    /**
     * 主键
     */
    private Long id ;
    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户email
     */
    private String email;
    // user sex , 1 for male ,0 for female
    /**
     * 用户性别：1男性 0女性
     */
    private int sex;

}
