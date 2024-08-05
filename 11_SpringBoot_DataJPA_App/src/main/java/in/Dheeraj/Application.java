package in.Dheeraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Dheeraj.entity.Player;
import in.Dheeraj.repository.RepositoryJpa;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		RepositoryJpa repositoryJpa = context.getBean(RepositoryJpa.class);
		
		Player p1 = new Player();
		p1.setId(1);
		p1.setPlayerName("Dheeraj");
		p1.setAge(23);
		p1.setLocation("Pune");

		repositoryJpa.save(p1);
		System.out.println("Data Inserted....");
		
	}

}
