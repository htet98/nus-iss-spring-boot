package sg.edu.nus.jpademo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.jpademo.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
