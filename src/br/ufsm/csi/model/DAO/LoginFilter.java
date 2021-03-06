package br.ufsm.csi.model.DAO;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class LoginFilter implements Filter {

    public LoginFilter() {
        
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		if(req.getSession().getAttribute("statusLogin") == null && req.getRequestURI().equals(".*(css|jpg|png|gif|js)")){
			
			RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
			
			return;
		}
		
		chain.doFilter(request, response);
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
