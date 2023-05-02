package com.duing;

import com.duing.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @SpringBootApplication
 * 声明我们的入口类  并且声明是springboot项目的
 * @EnableConfigurationProperties({FoodConfig.class})
 * 告诉主程序入口类  要自动引入配置文件
 * 配置文件对应的类作为他的参数
 */
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class DemoApplication {
    public static void main(String[] args) {
        //使用SpringApplication类的静态方法  启动springboot程序
        //方法的参数有两个  程序的入口  main函数的参数
        SpringApplication.run(DemoApplication.class,args);
    }
}
