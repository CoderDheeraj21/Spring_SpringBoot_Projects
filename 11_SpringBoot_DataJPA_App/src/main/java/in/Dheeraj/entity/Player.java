package in.Dheeraj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cricket_Player")
public class Player {
	
	@Id
	private Integer id;
	
	@Column(name = "Player_Name")
	private String playerName;
	
	@Column(name = "Player_age")
	private Integer age;
	
	@Column
	private String location;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", Age=" + Age + ", location=" + location + "]";
	}
	
	
}
