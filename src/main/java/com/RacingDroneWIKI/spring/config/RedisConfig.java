package com.RacingDroneWIKI.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import redis.clients.jedis.JedisPoolConfig;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

import static io.lettuce.core.RedisURI.Builder.sentinel;

@PropertySource("classpath:redis.properties")
@EnableRedisHttpSession
public class RedisConfig {
    @Value("${redis.passwd}")
    private String passwd;
    @Value("${redis.master}")
    private String master;
    @Value("${redis.sentineL1.host}")
    private String sentineL1Host;
    @Value("${redis.sentineL1.port}")
    private int sentineL1Port;
    @Value("${redis.sentineL2.host}")
    private String sentineL2Host;
    @Value("${redis.sentineL2.port}")
    private int sentineL2Port;
    @Value("${redis.sentineL3.host}")
    private String sentineL3Host;
    @Value("${redis.sentineL3.port}")
    private int sentineL3Port;
    @Bean
    public JedisConnectionFactory redisConnectionFactory()
    {
        JedisConnectionFactory jedisConnectionFactory= new JedisConnectionFactory(getRedisSentinelConfiguration());
        jedisConnectionFactory.setPassword(passwd);
        jedisConnectionFactory.setUsePool(true);
        jedisConnectionFactory.setPoolConfig(getJedisPoolConfig());
        jedisConnectionFactory.afterPropertiesSet();
        return jedisConnectionFactory;
    }
    private RedisSentinelConfiguration getRedisSentinelConfiguration(){
        return  new RedisSentinelConfiguration()
                .master(master)
                .sentinel(sentineL1Host, sentineL1Port);
    }
    private JedisPoolConfig getJedisPoolConfig(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(10);
        jedisPoolConfig.setMaxTotal(100);
        return  jedisPoolConfig;
    }
}

