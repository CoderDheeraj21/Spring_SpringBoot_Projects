package in.Dheeraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Dheeraj.client.PlayerClient;

@SpringBootApplication
public class PlayerClientRestAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(PlayerClientRestAppApplication.class, args);
		
		PlayerClient bean = run.getBean(PlayerClient.class);
		
		bean.getReqeustForMultiplePlayer();
	}

}
