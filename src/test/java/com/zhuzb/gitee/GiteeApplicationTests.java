package com.zhuzb.gitee;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GiteeApplicationTests {

    private static Logger logger = (Logger) LoggerFactory.getLogger(GiteeApplicationTests.class);

    @Test
    void contextLoads() {
        logger.debug("第一条Degug信息...");
    }

}
