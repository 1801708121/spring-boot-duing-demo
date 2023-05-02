package com.duing.config;

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
@ConfigurationProperties(prefix = "food")
public class FoodConfig {
    private String meat;
    private String rice;

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }
}
