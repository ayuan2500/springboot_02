package com.config;

import com.itheima.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * @ClassName UserConfig
 * @Description 配置类
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 20:02:00
 */
@Configuration
public class UserConfig {

    @Bean
    public User user() {
        return new User();
    }
}
