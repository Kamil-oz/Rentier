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
import rentier.model.FlatCondition;
import rentier.model.Homeware;
import rentier.repository.FlatConditionRepository;
import rentier.repository.FlatRepository;
import rentier.utils.FlatConditionMap;

@Controller
@RequestMapping("/condition")
public class FlatConditionController {
	@Autowired
	FlatConditionRepository flatConditionRepository;
	@Autowired
	FlatRepository flatRepository;
	
	@GetMapping("/add/{id}")
	public String addForm(@PathVariable long id, Model model) {
		Flat flat = flatRepository.getOne(id);
		model.addAttribute("flatConditionMap",FlatConditionMap.getMap());
		if (flat.getFlatCondition() == null) {
			model.addAttribute("condition", new FlatCondition());
			model.addAttribute("title", "Oceń stan mieszkania");
		} else {
			model.addAttribute("condition", flat.getFlatCondition());
			model.addAttribute("title", "Ponownie oceń stan mieszkania");
		}
		return "form/condition";
	}
	
	@PostMapping("/add/{id}")
	public String addSave(@PathVariable long id, @Valid FlatCondition flatCondition, BindingResult result) {
		if (result.hasErrors()) {
			return "nie udało się";
		} else {
			flatConditionRepository.save(flatCondition);
			Flat flat = flatRepository.getOne(id);
			flat.setFlatCondition(flatCondition);
			flatRepository.save(flat);
			return "redirect:/flat/all";
		}
	}
	
}
