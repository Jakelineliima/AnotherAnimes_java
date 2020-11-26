package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
		return "mensagem";
	}

	@GetMapping("/minhaconta")
	public String minhaContas(Model m) {
		ContaDAO dao = new ContaDAO();
		m.addAttribute("contas", dao.listarConta());
		return "minhaconta";
	}

	@GetMapping("/alterarconta")
	public String alterarConta(HttpServletRequest req, Model m) {
		int iduser = Integer.parseInt(req.getParameter("iduser"));
		ContaDAO dao = new ContaDAO();
		m.addAttribute("conta", dao.getContaPorCodigo(iduser));
		return "alterarconta";
	}

	@PostMapping("/alterarconta")
	public String atualizarConta(HttpServletRequest req, Model m) {
		int iduser = Integer.parseInt(req.getParameter("iduser"));
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		Conta p = new Conta();
		p.setIduser(iduser);
		p.setNome(nome);
		p.setEmail(email);
		p.setSenha(senha);
		ContaDAO dao = new ContaDAO();
		m.addAttribute("texto", dao.salvar(p));
		return "mensagem";
	}

	@GetMapping("/excluirconta")
	public String excluirConta(HttpServletRequest req, Model m) {
		int iduser = Integer.parseInt(req.getParameter("iduser"));
		ContaDAO dao = new ContaDAO();
		m.addAttribute("texto", dao.excluir(iduser));
		return "mensagem";
	}
	

	@PostMapping("login")
	public String efetuaLogin(HttpServletRequest req, HttpSession session) {
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		ContaDAO dao = new ContaDAO();
		Conta u = dao.efetuarLogin(email, senha);
		if (u != null) {
			session.setAttribute("usuarioLogado", u.getNome());
			return "index";
		} else {
			return "redirect:login";
		}
	}

	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login";
	}

}
