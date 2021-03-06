package com.jgkj.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author chen
 */
@SpringBootApplication
@MapperScan(basePackages = "com.jgkj.payment.mapper")    //这句一定要加，否则扫描不出来
public class WxPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxPayApplication.class, args);
    }
}
