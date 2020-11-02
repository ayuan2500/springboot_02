package com.itheima;

import com.config.EnableUser;
import com.config.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/***
 * @ClassName MySpringBootApplication
 * @Description 启动类：demo05工程获取demo04工程的bean
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 20:06:00
 */
@SpringBootApplication
//@ComponentScan("com")     //方法一：使用组件扫描，扫描包路径放大
//@Import(UserConfig.class)     //方法二：使用import注解导入配置类
@EnableUser   //方法三：添加注解@EnaleUser
public class MySpringBootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MySpringBootApplication.class, args);
        Object user = applicationContext.getBean("user");
        System.out.println(user);
    }
}
