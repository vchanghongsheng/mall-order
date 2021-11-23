package com.bin.slp.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MallOrderApplication implements ApplicationRunner {

    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(MallOrderApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) {
        log.info("==========================================");
        log.info("============= 启动成功 " + port + " ========");
        log.info("==========================================");
    }

}
