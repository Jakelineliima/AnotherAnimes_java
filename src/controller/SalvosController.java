package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class SalvosController {
	
	@GetMapping("/salvos")
	public String salvos(Model m) {
		return "salvos";
	}

}
