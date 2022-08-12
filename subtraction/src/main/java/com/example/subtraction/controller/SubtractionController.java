package com.example.subtraction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.subtraction.model.SubtractionModel;

@Controller
public class SubtractionController {

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}

	@GetMapping("/subtract")
	public String subtractForm(Model model) {
		model.addAttribute("Subtraction", new SubtractionModel());
		return "subtractForm";
	}

	@PostMapping("/subtract")
	public String subtractNumber(@ModelAttribute SubtractionModel subtractionModel, BindingResult result, Model model) {
		model.addAttribute("subtraction", subtractionModel);
		return "calculateDifference";
	}

}