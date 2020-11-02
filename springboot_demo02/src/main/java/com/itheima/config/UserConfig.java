package com.itheima.config;

import com.itheima.condition.OnClassCondition;
import com.itheima.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/***
 * @ClassName UserConfig
 * @Description 配置类
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 15:18:00
 */
@Configuration  //该注解用于表示该类就是一个配置类
public class UserConfig {
    @Bean   //@Bean注解修饰的方法，方法会执行，执行返回的实例对象会交给spring容器
    @Conditional(value = OnClassCondition.class)    //value指定某一个条件对象：如果返回true就是满足条件执行方法，如果返回false就是不满足条件，不执行方法
    public User user() {
        return new User();
    }
}
