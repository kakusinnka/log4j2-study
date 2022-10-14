package com.hzh;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppTest02 {

    @Test
    public void test001() {
        Logger logger = LoggerFactory.getLogger(AppTest02.class);

        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }

}