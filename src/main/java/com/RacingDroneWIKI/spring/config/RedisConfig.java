package com.RacingDroneWIKI.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import redis.clients.jedis.JedisPoolConfig;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import static io.lettuce.core.RedisURI.Builder.sentinel;

@PropertySource("classpath:redis.properties")
@EnableRedisHttpSession
public class RedisConfig {
    @Value("${redis.passwd}")
    private String passwd;
    @Value("${redis.cluster1.host}")
    private String cluster1Host;
    @Value("${redis.cluster1.port}")
    private int cluster1Port;
    @Value("${redis.cluster2.host}")
    private String cluster2Host;
    @Value("${redis.cluster2.port}")
    private int cluster2Port;
    @Value("${redis.cluster3.host}")
    private String cluster3Host;
    @Value("${redis.cluster3.port}")
    private int cluster3Port;
    @Value("${redis.cluster4.host}")
    private String cluster4Host;
    @Value("${redis.cluster4.port}")
    private int cluster4Port;
    @Value("${redis.cluster5.host}")
    private String cluster5Host;
    @Value("${redis.cluster5.port}")
    private int cluster5Port;
    @Value("${redis.cluster6.host}")
    private String cluster6Host;
    @Value("${redis.cluster6.port}")
    private int cluster6Port;
    @Bean
    public JedisConnectionFactory redisConnectionFactory()
    {
        JedisConnectionFactory jedisConnectionFactory=
                new JedisConnectionFactory(getRedisClusterConfiguration(),getJedisPoolConfig());
        jedisConnectionFactory.setPassword(passwd);
        jedisConnectionFactory.afterPropertiesSet();
        return jedisConnectionFactory;
    }

    private RedisClusterConfiguration getRedisClusterConfiguration(){
        RedisClusterConfiguration redisClusterConfig = new RedisClusterConfiguration();
        redisClusterConfig.setClusterNodes(getClusterNodes());
        redisClusterConfig.setMaxRedirects(3);
        return redisClusterConfig;
    }

    private Set<RedisNode> getClusterNodes(){
        Set<RedisNode> clusterNodes = new HashSet<RedisNode>();
        clusterNodes.add(new RedisNode(cluster1Host, cluster1Port));
        clusterNodes.add(new RedisNode(cluster2Host, cluster2Port));
        clusterNodes.add(new RedisNode(cluster3Host, cluster3Port));
        clusterNodes.add(new RedisNode(cluster4Host, cluster4Port));
        clusterNodes.add(new RedisNode(cluster5Host, cluster5Port));
        clusterNodes.add(new RedisNode(cluster6Host, cluster6Port));
        return clusterNodes;
    }

    private JedisPoolConfig getJedisPoolConfig(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(10);
        jedisPoolConfig.setMaxTotal(100);
        return  jedisPoolConfig;
    }
}

