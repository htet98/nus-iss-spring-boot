package sg.edu.nus.jpademo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.jpademo.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

}
