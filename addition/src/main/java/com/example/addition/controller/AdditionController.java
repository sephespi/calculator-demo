package com.example.addition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.addition.model.AdditionModel;

@Controller
public class AdditionController {

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}

	@GetMapping("/add")
	public String addForm(Model model) {
		model.addAttribute("Addition", new AdditionModel());
		return "additionForm";
	}

	@PostMapping("/add")
	public String addNumber(@ModelAttribute AdditionModel additionModel, BindingResult result, Model model) {
		model.addAttribute("addition", additionModel);
		return "calculateSum";
	}

}