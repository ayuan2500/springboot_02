package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @ClassName MySpringbootApplication
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年11月01日 11:16:00
 */
@SpringBootApplication
public class MySpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringbootApplication.class,args);
    }

    @RestController
    @RequestMapping("/test")
    class TestController {

        @GetMapping("/index")
        public String show() {
            return "hello world";
        }
    }
}
