package controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import dao.AdicionarDAO;
import model.Adicionar;

@Controller
public class AdicionarController {
	
	@GetMapping("/adicionar")
	public String adicionar() {
		return "adicionar";
	}
//Salvar
	@PostMapping("/adicionar")
	public String salvarTitulos(HttpServletRequest req, Model m) {
		Adicionar s = new Adicionar();
		s.setTitulo(req.getParameter("titulo"));
		s.setTemporada(req.getParameter("temporada"));
		s.setEpisodio(req.getParameter("episodio"));
		s.setImagem(req.getParameter("imagem"));
		AdicionarDAO dao = new AdicionarDAO();
		String texto = dao.salvar(s);
		m.addAttribute("texto", texto);
		return "mensagem";
	}
	
//Lista	
	@GetMapping("/salvos")
	public String meusSalvos(Model m) {
		AdicionarDAO dao = new AdicionarDAO();
		m.addAttribute("salvos", dao.listarSalvos());
		return "salvos";
		}
	

	
	@GetMapping("/alterarsalvo")
	public String alterarSalvo(HttpServletRequest req, Model m) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		AdicionarDAO dao = new AdicionarDAO();
		m.addAttribute("salvo", dao.getSalvoPorCodigo(codigo));
		return "alterarsalvo";
	}
	
	@PostMapping("/alterarsalvo")
	public String atualizarSalvo(HttpServletRequest req, Model m) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		String titulo = req.getParameter("titulo");
		String temporada= req.getParameter("temporada");
		String episodio = req.getParameter("episodio");
		String imagem = req.getParameter("imagem");
		Adicionar s = new Adicionar();
		s.setCodigo(codigo);
		s.setTitulo(titulo);
		s.setTemporada(temporada);
		s.setEpisodio(episodio);
		s.setImagem(imagem);
		AdicionarDAO dao = new AdicionarDAO();
		m.addAttribute("texto", dao.salvar(s));
		return "mensagem";
	}
	
	@GetMapping("/excluirsalvo")
	public String excluirSalvo(HttpServletRequest req, Model m) {
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		AdicionarDAO dao = new AdicionarDAO();
		m.addAttribute("texto", dao.excluir(codigo));
		return"mensagem";
	}
	
	
}