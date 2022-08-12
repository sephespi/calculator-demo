package com.example.multiplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.multiplication.model.MultiplicationModel;

@Controller
public class MultiplicationController {
	
	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/multiply")
	public String multiplyForm(Model model) {
		model.addAttribute("Multiplication", new MultiplicationModel());
		return "multiplicationForm";
	}
	
	@PostMapping("/add")
	public String multiplyNumber(@ModelAttribute MultiplicationModel multiplicationModel, BindingResult result, Model model) {
		model.addAttribute("multiplication", multiplicationModel);
		return "calculateProduct";
	}

}
