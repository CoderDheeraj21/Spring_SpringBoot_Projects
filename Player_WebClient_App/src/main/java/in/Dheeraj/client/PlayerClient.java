package in.Dheeraj.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.Dheeraj.binding.Player;

@Service
public class PlayerClient {

	public void invokeGetRequest() {
		String apiUrl = "http://localhost:8080/players";
		
		WebClient client = WebClient.create();
		String body = client.get()
			  .uri(apiUrl)
			  .retrieve()
			  .bodyToMono(String.class)
			  .block();
		
		System.out.println(body);
	}
	
	public void invokePostRequest() {
		String apiUrl = "http://localhost:8080/player";
		
		Player player = new Player();
		player.setPlayerName("Adesh");
		player.setPlayerAge(24);
		
		WebClient webClient = WebClient.create();
		
		String resp = webClient.post()
				 .uri(apiUrl)
				 .bodyValue(player)
				 .retrieve()
				 .bodyToMono(String.class)
				 .block();
		
		System.out.println(resp);
	}
	
	public void invokeGetRequestAsync() {
		String url = "http://localhost:8080/players";
		
		WebClient webClient = WebClient.create();
		webClient.get()
				 .uri(url)
				 .retrieve()
				 .bodyToMono(Player[].class)
				 .subscribe(PlayerClient::respHandler);
		
		System.out.println("*****************Request Sent****************");
	}
	
	public static void respHandler(Player[] player) {
		for(Player p: player) {
			System.out.println(p);
		}
	}
}
