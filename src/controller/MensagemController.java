package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MensagemController {
	@GetMapping("/mensagem")
	public String mensagem(Model m) {
		return "mensagem";
	}
}
