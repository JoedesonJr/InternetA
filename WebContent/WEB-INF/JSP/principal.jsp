<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Principal</title>
</head>
<body>
	<h1>Usuario: ${statusLogin.login}</h1>
	
	<br/>
	<br/> <a href="/InternetA/mvc?logica=redireciona_Logica&&direciona=atualizar"> > Alterar Cadastro </a> <br/>
	<br/> <a href="/InternetA/mvc?logica=redireciona_Logica&&direciona=index"> < Sair </a>

</body>
</html>