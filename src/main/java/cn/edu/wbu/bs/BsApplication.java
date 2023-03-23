package cn.edu.wbu.bs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("cn.edu.wbu.bs.dao")
public class BsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BsApplication.class, args);
    }

}
