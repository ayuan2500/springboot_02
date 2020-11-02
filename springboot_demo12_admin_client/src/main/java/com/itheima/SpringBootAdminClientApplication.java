package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @ClassName SpringBootAdminClientApplication
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年11月01日 12:09:00
 */
@SpringBootApplication
public class SpringBootAdminClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminClientApplication.class,args);
    }

    @RestController
    @RequestMapping("/user")
    class TestController {
        @RequestMapping("/findAll")
        public String a() {
            return "admin client aaaa";
        }
    }
}
