package in.Dheeraj.repository;

import org.springframework.data.repository.CrudRepository;

import in.Dheeraj.entity.Player;

public interface RepositoryJpa extends CrudRepository<Player, Integer>{

}
