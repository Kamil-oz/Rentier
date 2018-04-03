package rentier.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rentier.model.Flat;
import rentier.model.Homeware;
import rentier.repository.FlatRepository;
import rentier.repository.HomewareRepository;

@Controller
@RequestMapping("/homeware")
public class HomewareController {
	@Autowired
	HomewareRepository homewareRepository;
	@Autowired
	FlatRepository flatRepository;

	@RequestMapping("/show")
	public String show(Model model) {
		model.addAttribute("homeware", new Homeware());
		return "form/homeware";
	}

	@GetMapping("/add/{id}")
	public String addForm(@PathVariable long id, Model model) {
		Flat flat = flatRepository.getOne(id);
		if (flat.getHomeware() == null) {
			model.addAttribute("homeware", new Homeware());
		} else {
			model.addAttribute("homeware", flat.getHomeware());
		}
		return "form/homeware";
	}

	@PostMapping("/add/{id}")
	public String addSave(@PathVariable long id, @Valid Homeware homeware, BindingResult result) {
		if (result.hasErrors()) {
			return "nie udało się";
		} else {
			homewareRepository.save(homeware);
			Flat flat = flatRepository.getOne(id);
			flat.setHomeware(homeware);
			flatRepository.save(flat);
			return "redirect:/flat/all";
		}
	}
}
