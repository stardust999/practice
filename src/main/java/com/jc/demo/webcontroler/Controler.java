package com.jc.demo.webcontroler;

import com.jc.demo.dao.Yingshe;
import com.jc.demo.daob.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @auther JunCao
 * @date 2021年05月09日 10:49
 */
@RestController
public class Controler {
    @Autowired
    UserRepository userRepository;
    @RequestMapping("/test")
    public Object gettest(@RequestParam("tests")String aa){
        System.out.println(aa);
        return userRepository.save(new Yingshe(aa,aa));
        //return new String("cc");
    }
    @RequestMapping("/sent")
    @ResponseBody
    public Object gettal_user(@RequestParam("email")String email){
        return userRepository.findYingsheByEmail(email);
    }



}
