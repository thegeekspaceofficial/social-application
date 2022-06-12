package social.api.proxy.server.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ApiProxyTestService {

	@GetMapping(path = "/test", produces = "application/json")
	List<String> testView() {
		final List<String> serviceCalls = new ArrayList<>();
		serviceCalls.add("API-PROXY");
		return serviceCalls;
	}
}
