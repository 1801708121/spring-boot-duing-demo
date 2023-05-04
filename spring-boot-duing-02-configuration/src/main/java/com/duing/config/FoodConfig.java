package com.duing.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * food.rice=拌饭
 * food.meat=烤肉
 *
 * @ConfigurationProperties
 * 声明这是一个配置文件对应的类
 * prefix前缀指向配置文件中的一级目录
 *
 * @Configuration使用
 */
//@Configuration
@Data
@ConfigurationProperties(prefix = "food")
public class FoodConfig {
    private String meat;
    private String rice;
    private String[] sauce;

}
