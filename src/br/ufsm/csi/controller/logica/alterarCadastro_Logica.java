package br.ufsm.csi.controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufsm.csi.model.Usuario;
import br.ufsm.csi.model.DAO.UsuarioDAO;

public class alterarCadastro_Logica implements Logica{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		Usuario usuario = new Usuario();
		
		usuario.setId(Integer.parseInt(request.getParameter("id")));
		usuario.setLogin(request.getParameter("login"));
		usuario.setSenha(request.getParameter("senha"));
		
		UsuarioDAO uDAO = new UsuarioDAO();
		
		String pagina = "/WEB-INF/JSP/atualizarCadastro.jsp";
		
		try {
			boolean retorno = uDAO.Update(usuario);
		
			if(retorno)			
				request.setAttribute("statusAlterarUsuario", "USUARIO ALTERADO!");
			else
				request.setAttribute("statusAlterarUsuario", "ERRO! USUARIO NAO ALTERADO!");
		} catch (Exception e) {
			e.printStackTrace();
			
			return pagina;
		}
		request.setAttribute("usuarios", new UsuarioDAO().getUsuarios());
		
		return pagina;
	}

}
