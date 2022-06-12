package social.view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients("social.view.*")
@SpringBootApplication
public class SocialViewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialViewServiceApplication.class, args);
	}

}
