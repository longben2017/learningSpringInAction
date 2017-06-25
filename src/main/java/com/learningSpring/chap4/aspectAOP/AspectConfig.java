package com.learningSpring.chap4.aspectAOP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.learningSpring.chap4.aspectAOP")
@EnableAspectJAutoProxy
public class AspectConfig {

	@Bean
	public Audience audience(){
		return new Audience();
	}
}
