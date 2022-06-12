package social.view.openfeign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import social.view.config.OpenFeignConfiguration;

@FeignClient(name = "social-user-service", configuration = OpenFeignConfiguration.class)
@RibbonClient(name = "social-user-service")
public interface ProxySocialUserService {

	@GetMapping("/users/app/name")
	String userAppName();

}
