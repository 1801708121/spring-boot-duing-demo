package com.duing.controller;

import com.duing.bean.Food;
import com.duing.bean.Fruit;
import com.duing.bean.Vegetables;
import com.duing.config.FoodConfig;
import com.duing.config.FruitConfig;
import com.duing.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @RestController
 * 是@Controller 和 @ResponseBody 的组合
 */
@RestController
public class JsonController {
    /**
     * food.rice=rice
     * food.meat=meat
     * @Value 通过${}结构获取配置文件中的属性值
     */
//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;

    @Autowired
    private FoodConfig foodConfig;
    @RequestMapping("/json")
    public Food json(){
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        food.setSauce(foodConfig.getSauce());
        return food;
    }

    @Autowired
    private VegetablesConfig vegetablesConfig;
    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpeper(vegetablesConfig.getGreenpeper());
        return vegetables;
    }

    @Autowired
    private FruitConfig fruitConfig;
    @RequestMapping("/fruit")
    public Fruit fruit(){
        Fruit fruit = new Fruit();
        fruit.setApple(fruitConfig.getApple());
        fruit.setBanner(fruitConfig.getBanner());
        return fruit;
    }

    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;
    @RequestMapping("/jasypt")
    public String jasypt(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(username);
        stringBuffer.append("\t");
        stringBuffer.append(password);
        return stringBuffer.toString();
    }

}
