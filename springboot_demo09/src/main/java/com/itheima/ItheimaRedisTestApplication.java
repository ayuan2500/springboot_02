package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.Jedis;

/***
 * @ClassName ItheimaRedisTestApplication
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 21:35:00
 */
@SpringBootApplication
public class ItheimaRedisTestApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ItheimaRedisTestApplication.class, args);
        Object jedis = applicationContext.getBean("jedis");
        System.out.println(jedis);
    }
    @Bean
    public Jedis jedis () {
        return new Jedis("localhost",6379);
    }
}
