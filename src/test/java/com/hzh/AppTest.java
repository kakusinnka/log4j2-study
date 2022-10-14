package com.hzh;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class AppTest {

    @Test
    public void test001() {
        Logger logger = LogManager.getLogger(AppTest.class);

        logger.fatal("fatal");
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }

    @Test
    public void test002() {
        Logger logger = LogManager.getLogger(AppTest.class);

        logger.fatal("fatal");
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }
}