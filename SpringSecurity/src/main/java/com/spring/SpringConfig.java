package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan
public class SpringConfig {
//define a bean for view resolver
	
	@Bean
	public InternalResourceViewResolver getView() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("WEB-INF/view/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
