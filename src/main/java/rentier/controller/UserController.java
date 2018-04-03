package rentier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import rentier.model.User;
import rentier.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/register")
	public String huserRegister(Model model) {
		model.addAttribute("user" , new User());
		return "login";
	}
}
