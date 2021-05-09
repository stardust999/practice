package com.jc.demo.daob;

import com.jc.demo.dao.Yingshe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @auther JunCao
 * @date 2021年05月09日 11:33
 */
public interface UserRepository extends JpaRepository<Yingshe,Integer> {
    //@Query("select * from tbl_user u where u.emailAddress = ?1")
    Yingshe findYingsheByEmail(String email);

}
