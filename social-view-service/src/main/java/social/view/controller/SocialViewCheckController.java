package social.view.controller;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import social.view.openfeign.ProxySocialUserService;

@RestController
@RequestMapping(path = "${rest.api.prefix}/app")
public class SocialViewCheckController {

	@Value("${spring.application.name}")
	private String appName;

	@Autowired
	private ProxySocialUserService proxySocialUserService;

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping(path = "/name", produces = "application/json")
	String findApplicationName() {

		discoveryClient.getInstances("social-user-service").forEach((ServiceInstance serviceInstance) -> {
			System.out.println(ToStringBuilder.reflectionToString(serviceInstance));
		});

		discoveryClient.getInstances("social-user-service").stream().findFirst().ifPresent(userService -> {
			final String baseUrl = userService.getUri().toString();
			System.out.println("Service URL ------->" + baseUrl);
		});

		final String userAppName = proxySocialUserService.userAppName();
		return appName + userAppName;
	}

}
