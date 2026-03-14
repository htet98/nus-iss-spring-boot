package sg.edu.nus.jpademo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sg.edu.nus.jpademo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findUsersByUsername(String username);
	Optional<User> findUsersByUsernameAndPassword(String username, String password);
	Optional<User> findByEmail(String email);
	boolean existsByUsername(String username);
	boolean existsByEmail(String email);

}
