package in.Dheeraj.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.Dheeraj.biniding.Player;

@Service
public class PlayerClient {

	public void invokePlayerTicket() {
		
		String apiUrl = "http://localhost:8080/player";
		
		Player player = new Player();
		player.setPlayerAge(25);
		player.setPlayerName("Shivanand");
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<String> postForEntity = rt.postForEntity(apiUrl, player, String.class);
		
		System.out.println(postForEntity.getBody());
	}
	
	public void getReqeustForMultiplePlayer() {
		String apiUrl = "http://localhost:8080/players";
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Player[]> forEntity = rt.getForEntity(apiUrl, Player[].class);
		
		Player[] body = forEntity.getBody();
		
		for(Player player: body) {
			System.out.println(player);
		}
	}
}
