package social.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${rest.api.prefix}")
public class SocialUserCheckController {

	@Value("${spring.application.name}")
	private String appName;

	@GetMapping(path = "/app/name", produces = "application/json")
	String findApplicationName() {
		return appName;
	}

}
