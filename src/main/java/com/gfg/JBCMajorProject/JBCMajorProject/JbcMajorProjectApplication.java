package com.gfg.JBCMajorProject.JBCMajorProject;

import com.gfg.JBCMajorProject.JBCMajorProject.model.TimelineStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class JbcMajorProjectApplication {


	public static void main(String[] args) {
		SpringApplication.run(JbcMajorProjectApplication.class, args);
	}

}
