package in.Dheeraj.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import in.Dheeraj.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
