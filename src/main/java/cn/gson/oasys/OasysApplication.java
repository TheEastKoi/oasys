package cn.gson.oasys;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.WebApplicationInitializer;


@EnableScheduling // 启用定时任务的配置
@EnableCaching  // 开启缓存
@SpringBootApplication

public class OasysApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// 注意这里要指向原先用main方法执行的Application启动类
		return application.sources(OasysApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
}
