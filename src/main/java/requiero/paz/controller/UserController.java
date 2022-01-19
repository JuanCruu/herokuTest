package requiero.paz.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import requiero.paz.repository.UserRepository;
@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("users")
	public List<requiero.paz.model.User> getUsers(){
		return this.userRepo.findAll();
	}
}
