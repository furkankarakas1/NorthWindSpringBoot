package kodlamaio2.northwind2.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio2.northwind2.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
      User findByEmail(String email);
}
