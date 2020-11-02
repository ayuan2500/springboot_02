package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/***
 * @author ayuan
 * @version 1.0.0
 * @ClassName MySpringBootApplication
 * @Description 启动类：验证加入redis起步依赖就可以获取reidsTemplate，不加就获取不到
 * @createTime 2020年10月31日 14:57:00
 */
@SpringBootApplication
public class MySpringBootApplication {
    public static void main(String[] args) {
        // 返回值ConfigurableApplicationContext是一个bean工厂
        ConfigurableApplicationContext context = SpringApplication.run(MySpringBootApplication.class, args);
        // 1.获取名为redisTemplate的bean对象
        Object redisTemplate = context.getBean("redisTemplate");
        // 2.输出
        System.out.println(redisTemplate);
    }
}
