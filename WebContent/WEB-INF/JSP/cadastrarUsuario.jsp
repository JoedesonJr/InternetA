<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Usuario</title>
</head>
<body>
	<h1> Cadastrar Usuario </h1>
	
	<section>
		<form action="/InternetA/mvc?logica=cadastrarUsuario_Logica" method="post">
			<br/> <label for="login"> Login </label> <br/>
			<input type="text" id="Login" name="login" /> <br/>
			
			<br/> <label for="Senha"> Senha </label> <br/>
			<input type="text" id="Senha" name="senha" /> <br/><br/>
			
			<button type="submit" name="opcao" value="cadastrarUsuario"> Cadastrar </button>
		</form>
	</section>
	
	<br/> <a href="/InternetA/mvc?logica=redireciona_Logica&&direciona=index"> < Logar </a>
	
	<br/><c:if test="${not empty statusCadastroUsuario}">
		<h2> ${statusCadastroUsuario} </h2>
	</c:if>
</body>
</html>