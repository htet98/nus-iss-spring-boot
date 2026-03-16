package sg.edu.nus.jpademo.repo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.lang.String;
import java.util.Optional;
import org.springframework.aot.generate.Generated;
import org.springframework.data.jpa.repository.aot.AotRepositoryFragmentSupport;
import org.springframework.data.jpa.repository.query.QueryEnhancerSelector;
import org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport;
import sg.edu.nus.jpademo.model.User;

/**
 * AOT generated JPA repository implementation for {@link UserRepository}.
 */
@Generated
public class UserRepositoryImpl__AotRepository extends AotRepositoryFragmentSupport {
  private final RepositoryFactoryBeanSupport.FragmentCreationContext context;

  private final EntityManager entityManager;

  public UserRepositoryImpl__AotRepository(EntityManager entityManager,
      RepositoryFactoryBeanSupport.FragmentCreationContext context) {
    super(QueryEnhancerSelector.DEFAULT_SELECTOR, context);
    this.entityManager = entityManager;
    this.context = context;
  }

  /**
   * AOT generated implementation of {@link UserRepository#existsByEmail(java.lang.String)}.
   */
  public boolean existsByEmail(String email) {
    String queryString = "SELECT u.id FROM User u WHERE u.email = :email";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("email", email);
    query.setMaxResults(1);

    return !query.getResultList().isEmpty();
  }

  /**
   * AOT generated implementation of {@link UserRepository#existsByUsername(java.lang.String)}.
   */
  public boolean existsByUsername(String username) {
    String queryString = "SELECT u.id FROM User u WHERE u.username = :username";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("username", username);
    query.setMaxResults(1);

    return !query.getResultList().isEmpty();
  }

  /**
   * AOT generated implementation of {@link UserRepository#findByEmail(java.lang.String)}.
   */
  public Optional<User> findByEmail(String email) {
    String queryString = "SELECT u FROM User u WHERE u.email = :email";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("email", email);

    return Optional.ofNullable((User) convertOne(query.getSingleResultOrNull(), false, User.class));
  }

  /**
   * AOT generated implementation of {@link UserRepository#findUsersByUsername(java.lang.String)}.
   */
  public Optional<User> findUsersByUsername(String username) {
    String queryString = "SELECT u FROM User u WHERE u.username = :username";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("username", username);

    return Optional.ofNullable((User) convertOne(query.getSingleResultOrNull(), false, User.class));
  }

  /**
   * AOT generated implementation of {@link UserRepository#findUsersByUsernameAndPassword(java.lang.String,java.lang.String)}.
   */
  public Optional<User> findUsersByUsernameAndPassword(String username, String password) {
    String queryString = "SELECT u FROM User u WHERE u.username = :username AND u.password = :password";
    Query query = this.entityManager.createQuery(queryString);
    query.setParameter("username", username);
    query.setParameter("password", password);

    return Optional.ofNullable((User) convertOne(query.getSingleResultOrNull(), false, User.class));
  }
}
