package springboot.springbootapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringbootApiApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void getGreetingTest(){

		String urlGetGreeting = "http://localhost:" + port + "/greeting";

		assertThat(restTemplate.getForObject(urlGetGreeting, String.class))
				.isEqualTo("Hello from SpringBoot! :)");

	}

}
