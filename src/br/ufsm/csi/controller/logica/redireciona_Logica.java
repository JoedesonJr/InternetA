package br.ufsm.csi.controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufsm.csi.model.DAO.UsuarioDAO;

public class redireciona_Logica implements Logica{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		String direciona = request.getParameter("direciona");
		
		String pagina = "";
		
		if(direciona.equals("cadastrarUsuario"))
			pagina = "/WEB-INF/JSP/cadastrarUsuario.jsp";

		else if(direciona.equals("index"))
			pagina = "/index.jsp";
		
		else if(direciona.equals("principal"))
			pagina = "/WEB-INF/JSP/principal.jsp";
		
		else if(direciona.equals("atualizar")){
			pagina = "/WEB-INF/JSP/atualizarCadastro.jsp";
			
			request.setAttribute("usuarios", new UsuarioDAO().getUsuarios());
		}
		
		else if(direciona.equals("alterarCadastro")){
			pagina = "/WEB-INF/JSP/atualizarCadastro.jsp";
			
			String id = request.getParameter("id");
			
			request.setAttribute("usuarios", new UsuarioDAO().getUsuarios());
			request.setAttribute("usuarioAlterar", id);
			request.setAttribute("alterar", "ok");
		}
		
		return pagina;
	}

}
