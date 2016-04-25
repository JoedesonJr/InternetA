<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Atualizar Cadastro</title>
</head>
<body>
	<h1> Atualizar Cadastros </h1>
	
	<section>
		<table>
			<thead>
				<tr>
				<tr>
					<th>Id</th>
					<th></th>
					<th>Login</th>
					<th></th>
					<th>Senha</th>
					<th></th>
					<th>Ações</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="usuario" items="${usuarios}">
					<tr>
						<td>${usuario.id}</td>
						<th></th>
						<td>${usuario.login}</td>
						<th></th>
						<td>${usuario.senha}</td>
						<th></th>
						<td>
							<a href="/InternetA/mvc?logica=redireciona_Logica&&id=${usuario.id}&&direciona=alterarCadastro">Alterar</a>
							<a href="/InternetA/mvc?logica=removerCadastro_Logica&&id=${usuario.id}">Remover</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
	
	<c:if test="${not empty alterar}">
		<c:import url="/WEB-INF/JSP/alterarCadastro.jsp" />
	</c:if>
	
	<br/><c:if test="${not empty statusAlterarUsuario}">
		<h2> ${statusAlterarUsuario} </h2>
	</c:if>
	
	<br/><c:if test="${not empty statusRemoverUsuario}">
		<h2> ${statusRemoverUsuario} </h2>
	</c:if>
	
	<br/> <a href="/InternetA/mvc?logica=redireciona_Logica&&direciona=principal"> < Voltar </a>
	
</body>
</html>