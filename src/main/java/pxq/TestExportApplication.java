package pxq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

/**
 * @describe:
 * @user: pxq
 * @date: 2019/12/3 13:57
 */
@SpringBootApplication
public class TestExportApplication {
    private static final Logger log = LoggerFactory.getLogger(TestExportApplication.class);
    public static void main(String[] args) {
        log.info("starting Server ......");
        Date date = new Date();
        SpringApplication.run(TestExportApplication.class,args);
        Date date1 = new Date();
        log.info("starting server success ......");
        log.info("spend "+(date1.getSeconds()-date.getSeconds())+" s");
    }

}
