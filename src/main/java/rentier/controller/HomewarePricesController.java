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
import rentier.repository.HomewarePricesRepository;
import rentier.utils.HomewarePricesMap;

@Controller
@RequestMapping("/hp")
public class HomewarePricesController {
	@Autowired
	HomewarePricesRepository homewarePricesRepository;

	@GetMapping("/add")
	public String addShow(Model model) {
		model.addAttribute("homewarePrices", new HomewarePrices());
		model.addAttribute("homewarePricesMap", HomewarePricesMap.getMap());
		return "form/homewareprices";
	}

	@PostMapping("/add")
	public String addSave(@Valid HomewarePrices homewarePrices, BindingResult result) {
		homewarePricesRepository.save(homewarePrices);
		return "redirect:/flat/all";
	}
}
