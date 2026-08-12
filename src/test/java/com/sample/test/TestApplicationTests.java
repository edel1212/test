package com.sample.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
        log.info("Hi");
        assertEquals(1,4);
	}

}
