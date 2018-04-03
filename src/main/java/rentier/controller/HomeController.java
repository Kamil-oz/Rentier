package rentier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import rentier.repository.UserRepository;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
}

//d3js
//might charts
