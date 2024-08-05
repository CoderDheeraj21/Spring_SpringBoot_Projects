package in.Dheeraj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.Dheeraj.entity.Player;
import in.Dheeraj.repo.PlayerRepo;


@Service
public class PlayerService {

	private PlayerRepo playerRepo;

	public PlayerService(PlayerRepo playerRepo) {
		this.playerRepo = playerRepo;
	}

	public String upsert(Player player) {
		Integer playerId = player.getPlayerId();

		boolean exists = playerId != null && playerRepo.existsById(playerId);

		playerRepo.save(player);

		if (exists) {
			return "Record Updated Successfully";
		} else {
			return "Record Inserted Successfully";
		}
	}
	
	public List<Player> showAll(){
		return playerRepo.findAll();
	}
	
	public String deletePlayer(Integer playerId) {
		playerRepo.deleteById(playerId);
		
		return "Deleted Record Successfully";
	}
}
