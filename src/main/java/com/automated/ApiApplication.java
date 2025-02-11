package com.automated;

import cn.dev33.satoken.SaManager;
import org.dromara.autotable.springboot.EnableAutoTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoTable
@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiApplication.class, args);
		System.out.println("启动成功，Sa-Token 配置如下：" + SaManager.getConfig());
	}

}
