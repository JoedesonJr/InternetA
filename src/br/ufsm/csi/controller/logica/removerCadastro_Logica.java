package br.ufsm.csi.controller.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufsm.csi.model.Usuario;
import br.ufsm.csi.model.DAO.UsuarioDAO;

public class removerCadastro_Logica implements Logica{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		
		UsuarioDAO uDAO = new UsuarioDAO();
		
		String pagina = "/WEB-INF/JSP/atualizarCadastro.jsp";
		
		try {
			boolean retorno = uDAO.Delete(request.getParameter("id"));
		
			if(retorno)			
				request.setAttribute("statusRemoverUsuario", "USUARIO REMOVIDO!");
			else
				request.setAttribute("statusRemoverUsuario", "ERRO! USUARIO NAO REMOVIDO!");
		} catch (Exception e) {
			e.printStackTrace();
			
			return pagina;
		}
		request.setAttribute("usuarios", new UsuarioDAO().getUsuarios());
		
		return pagina;
	}

}
