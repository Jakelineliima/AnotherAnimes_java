package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SobreController {
	
	@GetMapping("/sobre")
	public String sobre(Model m) {
		return "sobre";
	}

}
