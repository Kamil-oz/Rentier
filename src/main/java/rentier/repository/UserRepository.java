package rentier.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rentier.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
