package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/***
 * @ClassName MyConditionApplication
 * @Description 启动类：在spring容器中有一个user的bean对象，如果导入了redisclient的坐标则加载该bean，如果没有导入则不加载该bean
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 15:14:00
 */
@SpringBootApplication
public class MyConditionApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MyConditionApplication.class, args);
        //获取名为user的bean对象
        Object user = applicationContext.getBean("user");
        System.out.println(user);
    }
}
