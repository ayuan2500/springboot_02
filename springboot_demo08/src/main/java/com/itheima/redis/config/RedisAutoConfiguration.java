package com.itheima.redis.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;


/***
 * @ClassName RedisAutoConfiguration
 * @Description 配置类
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 21:25:00
 */
@Configuration
@EnableConfigurationProperties(RedisProperties.class)
@ConditionalOnClass(Jedis.class)
public class RedisAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(name = "jedis")
    public Jedis jedis(RedisProperties redisProperties) {
        System.out.println(redisProperties.getHost() + " : " + redisProperties.getPort());
        return new Jedis(redisProperties.getHost(),redisProperties.getPort());
    }
}
