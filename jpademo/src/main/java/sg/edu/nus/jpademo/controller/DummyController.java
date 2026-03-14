package sg.edu.nus.jpademo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.jpademo.model.Category;
import sg.edu.nus.jpademo.model.Tag;
import sg.edu.nus.jpademo.model.User;
import sg.edu.nus.jpademo.repo.CategoryRepository;
import sg.edu.nus.jpademo.repo.TagRepository;
import sg.edu.nus.jpademo.repo.UserRepository;

@RestController
public class DummyController {

	@Autowired
	CategoryRepository cRepo;

	@Autowired
	TagRepository tRepo;

	@Autowired
	UserRepository uRepo;

	@GetMapping("/test")
	public String getMethodname(@RequestParam(required = false) String param) {
		System.out.println("Controller executed...");
		
		Category c1 = new Category("Kitchen Knives", "Simple Home Knives");
		Category c2 = new Category("Chef Knives", "Simple Professional Knives");
		Category c3 = new Category("Protection Gear", "Knife Glove");
		cRepo.save(c1);
		cRepo.save(c2);
		cRepo.save(c3);

		Tag t1 = new Tag("Professional");
		Tag t2 = new Tag("On Sale");
		Tag t3 = new Tag("Carbon");
		Tag t4 = new Tag("Stainless Steel");
		tRepo.save(t1);
		tRepo.save(t2);
		tRepo.save(t3);
		tRepo.save(t4);

		User u1 = new User("Marry Jane", "1234", "ahbeng@nus.edu.sg", "Marry", "Jane", LocalDate.of(1995, 5, 20), null);
		uRepo.save(u1);
		return "Controller works...";
	}

}
