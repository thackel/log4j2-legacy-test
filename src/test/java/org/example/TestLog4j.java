package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class TestLog4j {

    public Logger log = LogManager.getLogger();

    @Test
    public void test(){
        log.info("TEST");
    }
}
