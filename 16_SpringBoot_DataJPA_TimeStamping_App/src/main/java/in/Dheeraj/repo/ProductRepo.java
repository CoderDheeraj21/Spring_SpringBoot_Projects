package in.Dheeraj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Dheeraj.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
