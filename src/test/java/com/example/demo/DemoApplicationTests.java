package com.example.demo;

import com.example.demo.client.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	Client client;

	@Test
	void testGetAdvice() {
		var advice = client.getAdvice();
		Assertions.assertNotNull(advice);
		System.out.println(advice);
	}

}
