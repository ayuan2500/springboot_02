package com.itheima;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * @ClassName SpringBootAdminServerApplication
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年11月01日 12:06:00
 */
@SpringBootApplication
@EnableAdminServer    //该注解用于启用admin的Server功能
public class SpringBootAdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminServerApplication.class,args);
    }
}
