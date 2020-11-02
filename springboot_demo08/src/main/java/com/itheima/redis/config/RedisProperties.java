package com.itheima.redis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;


/***
 * @ClassName RedisProperties
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 21:28:00
 */
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {
    private String host = "localhost";  //赋予默认值ip
    private Integer port = 6379;    //赋予默认值端口

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
