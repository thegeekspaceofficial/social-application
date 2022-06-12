package social.eureka.client.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableEurekaClient
@Configuration
@ComponentScan(basePackages = "social.eureka.client.*")
public class AppConfiguration {

}
