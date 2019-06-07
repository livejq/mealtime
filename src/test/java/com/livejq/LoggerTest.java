package com.livejq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Slf4j
//@Data
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void testLogger() {
        String name = "zhl";
        String password = "1234";

//        logger.debug("debug..."); 默认输出的日志级别为info以上，所以此debug将不会输出
        logger.info("info...name = {}, password = {}", name, password);
        logger.error("error...");
    }
}
