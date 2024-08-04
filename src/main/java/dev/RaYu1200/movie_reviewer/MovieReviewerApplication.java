package dev.RaYu1200.movie_reviewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieReviewerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieReviewerApplication.class, args);
	}

	@GetMapping("/healthCheck")
	public String apiHealthCheck() {
		return "The server is up and running!";
	}
}
