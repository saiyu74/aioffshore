package com.ai_offshore.stsprojects.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/system")
public class KubunMasterKanriController {

	@GetMapping("/KubunMasterKanri")
	public String index(Model model) {
		return "/system/KubunMasterKanri";
	}
}
