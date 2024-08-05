package in.Dheeraj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Dheeraj.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
