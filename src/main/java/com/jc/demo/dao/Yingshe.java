package com.jc.demo.dao;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

/**
 * @auther JunCao
 * @date 2021年05月09日 11:20
 */
@Entity
@Table(name = "tbl_user")
public class Yingshe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "last_name", length = 50)
    private String lastname;
    @Column(name = "email_address",length = 80)
    private String email;


    public Yingshe(String lastname, String email) {
        this.lastname = lastname;
        this.email = email;
    }
    public Yingshe(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
