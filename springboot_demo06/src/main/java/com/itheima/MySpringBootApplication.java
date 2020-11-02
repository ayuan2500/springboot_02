package com.itheima;

import com.config.MyImportSelector;
import com.itheima.pojo.Role;
import com.itheima.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/***
 * @ClassName MySpringBootApplication
 * @Description 启动类，需求：@Import注解加载配置文件中的Bean
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 20:27:00
 */
@SpringBootApplication
@Import(MyImportSelector.class) //Import加载配置文件中的Bean
public class MySpringBootApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MySpringBootApplication.class, args);
        //获取加载的bean
        User user = applicationContext.getBean(User.class); //获取user对象
        System.out.println(user);
        Role role = applicationContext.getBean(Role.class); //获取role对象
        System.out.println(role);
    }
}
