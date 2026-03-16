package sg.edu.nus.jpademo.repo;


import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jpa.test.autoconfigure.TestEntityManager;

import sg.edu.nus.jpademo.model.User;

@DataJpaTest
public class SimpleTestForUserCRUD {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	private TestEntityManager em;
	
	@Test
	@DisplayName("Test User Creation")
	void saveUser() {
		User u1 = new User("Marry Jane", "ahbeng@nus.edu.sg", "1234", "Marry", "Jane", LocalDate.of(1995, 5, 20));
		User savedUser = userRepo.save(u1);
		em.persistAndFlush(savedUser);
		assertThat(savedUser.getId()).isNotNegative().isNotNull();
	}
	
	@Test
    @DisplayName("Test User Creation")
    void findUser() {
		 List<User> list = userRepo.findAll();
		 assertThat(list.size()>0);
    }
	
	@Test
    @DisplayName("Test findUserByUserName")
    void findUserByUserName() {
		 Optional<User> list = userRepo.findUsersByUsername("notinrecord");
		 assertThat(list.isPresent());
    } 
	
}
