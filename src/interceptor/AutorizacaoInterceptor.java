package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AutorizacaoInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object controller) throws Exception {

		String uri = req.getRequestURI();

		if (uri.endsWith("login") || uri.endsWith("index") || uri.endsWith("contato") || uri.endsWith("conta")
				|| uri.endsWith("sobre") || uri.endsWith("alterarcontato") || uri.contains("imagens")
				|| uri.contains("css")) {
			return true;
		} else if (req.getSession().getAttribute("usuarioLogado") != null) {
			return true;
		} else {
			res.sendRedirect("login");
			return false;
		}
	}
}
