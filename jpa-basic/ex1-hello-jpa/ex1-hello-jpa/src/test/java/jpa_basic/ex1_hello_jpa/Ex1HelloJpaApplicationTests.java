package jpa_basic.ex1_hello_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ex1HelloJpaApplicationTests {

	@Test
	void contextLoads() {
	}

	public static void main(String[] args) {
		SpringApplication.run(Ex1HelloJpaApplicationTests.class, args);
	}
}