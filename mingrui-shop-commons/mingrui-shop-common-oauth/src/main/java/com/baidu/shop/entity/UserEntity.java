package com.baidu.shop.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @ClassName UserEntity
 * @Description: TODO
 * @Author wyj
 * @Date 2021/3/12
 * @Version V1.0
 **/
@Data
@Table(name = "tb_user")
public class UserEntity {
    @Id
    private Integer id;

    private String username;

    private String password;

    private String phone;

    private Date created;

    private String salt;
}
