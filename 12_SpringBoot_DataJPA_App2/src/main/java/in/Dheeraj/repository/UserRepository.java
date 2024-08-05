package in.Dheeraj.repository;

import org.springframework.data.repository.CrudRepository;

import in.Dheeraj.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
