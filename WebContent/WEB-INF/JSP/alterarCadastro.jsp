<br/> <h1> Alterar Usuario: ${usuarioAlterar} </h1>
	
<section>
	 <form action="/InternetA/mvc?logica=alterarCadastro_Logica&&id=${usuarioAlterar}" method="post">
		<br/> <label for="login"> Login </label> <br/>
		<input type="text" id="Login" name="login" /> <br/>
			
		<br/> <label for="Senha"> Senha </label> <br/>
		<input type="text" id="Senha" name="senha" /> <br/><br/>
			
		<button type="submit" name="opcao" value="cadastrarUsuario"> Alterar </button>
	</form>
</section>