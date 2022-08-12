package com.example.division.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.division.model.DivisionModel;

@Controller
public class DivisionController {
	
	@GetMapping("/")
	public String getIndex() {
		return "index";
	}

	@GetMapping("/divide")
	public String divideForm(Model model) {
		model.addAttribute("Division", new DivisionModel());
		return "divisionForm";
	}

	@PostMapping("/divide")
	public String addNumber(@ModelAttribute DivisionModel divisionModel, BindingResult result, Model model) {
		model.addAttribute("division", divisionModel);
		return "calculateQuotient";
	}

}
