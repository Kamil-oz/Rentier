package rentier.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rentier.model.HomewarePrices;
import rentier.model.Renovation;
import rentier.repository.RenovationRepository;
import rentier.utils.RenovationMap;

@RequestMapping("/renovation")
@Controller
public class RenovationController {
	@Autowired
	RenovationRepository renovationRepository;
	
	@GetMapping("/add")
	public String addShow(Model model) {
		model.addAttribute("renovation", new Renovation());
		model.addAttribute("renovationMap", RenovationMap.getMap());
		return "form/renovation";
	}
	
	@PostMapping("/add")
	public String addSave(@Valid Renovation renovation, BindingResult result) {
		renovationRepository.save(renovation);
		return "redirect:/flat/all";
	}
	
	
}
