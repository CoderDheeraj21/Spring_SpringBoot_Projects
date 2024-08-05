package in.Dheeraj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.Dheeraj.entity.Player;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Integer>{
	
}
