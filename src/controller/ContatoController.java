package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.ContatoDAO;
import model.Contato;

@Controller
public class ContatoController {

	@GetMapping("/contato")
	public String contato() {
		return "contato";
	}

	@PostMapping("/contato")
	public String enviaMensagem(HttpServletRequest req, Model m) {
		Contato p = new Contato();
		p.setNome(req.getParameter("nome"));
		p.setEmail(req.getParameter("email"));
		p.setMensagem(req.getParameter("mensagem"));
		ContatoDAO dao = new ContatoDAO();
		String texto = dao.salvar(p);
		m.addAttribute("texto", texto);
		return "mensagem";
	}

	@GetMapping("/contatomsg")
	public String minhasMsg(Model m) {
		ContatoDAO dao = new ContatoDAO();
		m.addAttribute("contato", dao.listarMsg());
		return "/contatomsg";
	}

	@GetMapping("/alterarmgs")
	public String alterarMgs(HttpServletRequest req, Model m) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		ContatoDAO dao = new ContatoDAO();
		m.addAttribute("contato", dao.getMgsporCodigo(codigo));
		return "alterarmgs";
	}

	@PostMapping("/alterarmgs")
	public String atualizarMgs(HttpServletRequest req, Model m) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String mensagem = req.getParameter("mensagem");
		Contato p = new Contato();
		p.setCodigo(codigo);
		p.setNome(nome);
		p.setEmail(email);
		p.setMensagem(mensagem);
		ContatoDAO dao = new ContatoDAO();
		m.addAttribute("texto", dao.salvar(p));
		return "mensagem";
	}

	@GetMapping("/excluirmgs")
	public String excluirMgs(HttpServletRequest req, Model m) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		ContatoDAO dao = new ContatoDAO();
		m.addAttribute("texto", dao.excluir(codigo));
		return "mensagem";
	}

}
