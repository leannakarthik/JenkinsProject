package com.dailycodecicd.cicddemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CicdDemoApplicationTests {
	public static final Logger logger = LoggerFactory.getLogger(CicdDemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("its my test class");
		assertEquals(true,true);
	}

}
