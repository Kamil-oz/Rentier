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
import org.springframework.web.bind.annotation.ResponseBody;

import rentier.model.Flat;
import rentier.model.FlatCondition;
import rentier.model.Homeware;
import rentier.repository.FlatConditionRepository;
import rentier.repository.FlatRepository;

@Controller
@RequestMapping("/flat")
public class FlatController {
	@Autowired
	FlatRepository flatRepository;
	
	@GetMapping("/add")
	public String flatAddRedirect(Model model) {
		model.addAttribute("flat",new Flat());
		model.addAttribute("title", "Dodaj mieszkanie");
		return "form/flat";
	}
	
	@PostMapping("/add")
	public String flatAddSave(@Valid Flat flat, BindingResult result) {
		if (result.hasErrors()) {
			return "nie udało się";
		} else {
			flatRepository.save(flat);
			return "redirect:/flat/all";
		}
	}
	
	@GetMapping("/edit/{id}")
	public String editRedirect(Model model, @PathVariable long id) {
		model.addAttribute("flat",flatRepository.getOne(id));
		model.addAttribute("title", "Edytuj mieszkanie");
		return "form/flat";
	}
	
	@PostMapping("/edit/{id}")
	public String flatEditSave(@Valid Flat flat, BindingResult result, @PathVariable long id) {
		if (result.hasErrors()) {
			return "nie udało się";
		} else {
			Flat temp = flatRepository.getOne(id);
			flat.setFlatCondition(temp.getFlatCondition());
			flat.setHomeware(temp.getHomeware());
			flatRepository.save(flat);
			return "redirect:/flat/all";
		}
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteFlat(@PathVariable long id) {
		flatRepository.deleteById(id);
		return "redirect:/flat/all";
	}
	
	
	@RequestMapping("/all")
	public String showAll(Model model) {
		model.addAttribute("flats", flatRepository.findAll());
		return "list/flats";
	}
	
	
	
}
