package br.ufsm.csi.controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufsm.csi.model.Usuario;
import br.ufsm.csi.model.DAO.UsuarioDAO;

public class cadastrarUsuario_Logica implements Logica{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		Usuario usuario = new Usuario();
		
		usuario.setLogin(request.getParameter("login"));
		usuario.setSenha(request.getParameter("senha"));
		
		String pagina = "/WEB-INF/JSP/cadastrarUsuario.jsp";
		
		try {
			boolean retorno = new UsuarioDAO().Insert(usuario);
		
			if(retorno)			
				request.setAttribute("statusCadastroUsuario", "USUARIO CADASTRADO!");
			else
				request.setAttribute("statusCadastroUsuario", "ERRO! USUARIO NAO CADASTRADO!");
			
		} catch (Exception e) {
			e.printStackTrace();
			
			return pagina;
		}
		
		return pagina;
	}

}
