package in.Dheeraj.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "sbms-welcome-api-app")
public interface WelcomeApiClient {

	@GetMapping("/welcome")
	public String invokeWelcomeApi();
}
