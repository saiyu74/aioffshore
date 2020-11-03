package com.ai_offshore.stsprojects.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dummy")
public class CommingSoonController {

	@GetMapping()
	public String index(Model model) {
		return "/common/CommingSoon";
	}
}
