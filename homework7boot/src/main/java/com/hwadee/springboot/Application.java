package com.hwadee.springboot;

import com.hwadee.springboot.entity.Goods;
import com.hwadee.springboot.service.GoodsService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication
@MapperScan("com.hwadee.springboot.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

    }
}
