package com.ydaniju.lil.learningspring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LearningSpringApplicationTests {

	@Test
	void contextLoads() {
		assertThat(true).isTrue();
	}
}
