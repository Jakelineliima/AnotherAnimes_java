package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import dao.ContaDAO;
import model.Conta;

@Controller
public class ContaController {
	
	@GetMapping("/conta")
	public String conta() {
		return "conta";
	}
	
	@PostMapping("/conta")
	public String criarConta(HttpServletRequest req, Model m) {
		Conta p = new Conta();
		p.setNome(req.getParameter("nome"));
		p.setEmail(req.getParameter("email"));
		p.setSenha(req.getParameter("senha"));
		ContaDAO dao = new ContaDAO();
		String texto = dao.salvar(p);
		m.addAttribute("texto", texto);
		return "/conta";
	}
	
	@GetMapping("/minhaconta")
	public String minhaConta(Model m) {
		ContaDAO dao = new ContaDAO();
		m.addAttribute("conta", dao.listarConta());
		return "minhaconta";
		}
	
	@GetMapping("/alterarconta")
	public String alterarConta(HttpServletRequest req, Model m) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		ContaDAO dao = new ContaDAO();
		m.addAttribute("conta", dao.getContaporCodigo(codigo));
		return "alterarconta";
	}
	
	@PostMapping("/alterarconta")
	public String atualizarConta(HttpServletRequest req, Model m) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		Conta s = new Conta();
		s.setCodigo(codigo);
		s.setNome(nome);
		s.setEmail(email);
		s.setSenha(senha);
		ContaDAO dao = new ContaDAO();
		m.addAttribute("texto", dao.salvar(s));
		return "mensagem";
	}
	
	@GetMapping("/excluirconta")
	public String excluirConta(HttpServletRequest req, Model m) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		ContaDAO dao = new ContaDAO();
		m.addAttribute("texto", dao.excluir(codigo));
		return"";
	}
	
	
}
	

