package com.ai_offshore.stsprojects.controller.jinjikanri;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jinjikanri")
public class ShainListController {

	@GetMapping("/shainlist")
	public String index(Model model) {
		return "/jinjikanri/shainlist";
	}
}
