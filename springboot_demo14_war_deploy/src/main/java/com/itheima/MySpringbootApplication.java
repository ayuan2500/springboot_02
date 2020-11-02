package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @ClassName com.itheima.MySpringbootApplication
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年11月01日 14:58:00
 */
@SpringBootApplication
public class MySpringbootApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MySpringbootApplication.class,args);
    }

    @RestController
    class TestController{
        @RequestMapping("/hello")
        public String hello() {
            return "hello war";
        }
    }
}
