package in.Dheeraj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PlayerDetails")
public class Player {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer playerId;
	
	private String playerName;
	
	private Integer playerAge;
	

}
