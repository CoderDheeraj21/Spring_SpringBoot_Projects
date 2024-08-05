package in.Dheeraj.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.Dheeraj.entity.Player;
import in.Dheeraj.service.PlayerService;

@RestController
public class PlayerController {
	
	private PlayerService playerService;
	
	public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
		
	}
	
	@GetMapping("/players")
	public ResponseEntity<List<Player>> getPlayer(){
		List<Player> showAll = playerService.showAll();
		
		return new ResponseEntity<List<Player>>(showAll, HttpStatus.OK);
	}
	
	@PostMapping("/player")
	public ResponseEntity<String> insertPlayer(@RequestBody Player player){
		String status = playerService.upsert(player);
		return new ResponseEntity<String>(status, HttpStatus.CREATED);
	}
	
	@PutMapping("/player")
	public ResponseEntity<String> updatePlayer(@RequestBody Player player){
		String status = playerService.upsert(player);
		
		return new ResponseEntity<String>(status, HttpStatus.CREATED);
	}
	
	@DeleteMapping("player/{playerId}")
	public ResponseEntity<String> deletePlayer(@PathVariable("playerId") Integer playerId){
		String deletePlayer = playerService.deletePlayer(playerId);
		
		return new ResponseEntity<String>(deletePlayer, HttpStatus.OK);
	}
	
}
