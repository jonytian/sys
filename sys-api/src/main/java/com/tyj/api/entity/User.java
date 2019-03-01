package com.tyj.api.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by tyj on 2019/03/01.
 */
@Data
@Entity
@Table(name = "sys_user")
public class User {
    public User(){
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private Date birthday;
    @Column(nullable = false)
    private String sex;
    @Column(nullable = false)
    private String address;



}
