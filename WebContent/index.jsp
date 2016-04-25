<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title> Login </title>
</head>
<body>
	<h1> Logar na App </h1>

	<section>
		<form action="/InternetA/mvc?logica=logar_Logica" method="post">
			<br/> <label for="login"> Login </label> <br/>
			<input type="text" id="Login" name="login" /> <br/>
			
			<br/> <label for="Senha"> Senha </label> <br/>
			<input type="password" id="Senha" name="senha" /> <br/><br/>
			
			<button type="submit" name="opcao" value="logar"> Logar </button>
		</form>
	</section>
	
	<br/> <a href="/InternetA/mvc?logica=redireciona_Logica&&direciona=cadastrarUsuario"> > Cadastrar Usuario </a>
	
	<c:if test="${not empty statusLogin}">
		<h2> USUARIO OU SENHA INVALIDOS! </h2>
	</c:if>
</body>
</html>