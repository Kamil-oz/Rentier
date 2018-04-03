package rentier.controller;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rentier.model.Flat;
import rentier.model.HomewarePrices;
import rentier.model.Ofer;
import rentier.model.Renovation;
import rentier.repository.FlatRepository;
import rentier.repository.HomewarePricesRepository;
import rentier.repository.OferRepository;
import rentier.repository.RenovationRepository;


@Controller
@RequestMapping("/ofer")
public class OferController {
	@Autowired
	FlatRepository flatRepository;
	@Autowired
	RenovationRepository renovationRepository;
	@Autowired
	HomewarePricesRepository homewarePricesRepository;
	@Autowired
	OferRepository oferRepository;
	
	@GetMapping("/add")
	public String addShow(Model model) {
		model.addAttribute("ofer", new Ofer());
		return "form/ofer";
	}
	
	@PostMapping("/add")
	public String addSave(@Valid Ofer ofer, BindingResult result) {
		if (result.hasErrors()) {
			return "nie udało się";
		} else {
			oferRepository.save(ofer);
			return "redirect:/flat/all";
		}
	}
	
	@ModelAttribute("flats")
	public Collection<Flat> flats() {
		return flatRepository.findAll();
	}
	
	@ModelAttribute("homewares")
	public Collection<HomewarePrices> homewares() {
		return homewarePricesRepository.findAll();
	}
	
	@ModelAttribute("renovations")
	public Collection<Renovation> renovations() {
		return renovationRepository.findAll();
	}
}
