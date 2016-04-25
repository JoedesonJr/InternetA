package br.ufsm.csi.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.ufsm.csi.model.Usuario;

public class UsuarioDAO {
	
	private Connection conn = (Connection) ConectDB.getConexao();
	private PreparedStatement stmt;
	private boolean autenticado = false;
	private String sql;
	
	public boolean Select (Usuario usuario) throws Exception{
		sql = "SELECT * FROM usuario WHERE login =? AND senha =? ;";
		
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, usuario.getLogin());
		stmt.setString(2, usuario.getSenha());
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			autenticado = true;
		}
		
		try{
			stmt.execute();
			stmt.close();
			
			autenticado = true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return autenticado;
	}
	
	public boolean Insert (Usuario usuario) throws Exception{
		sql = "INSERT INTO usuario VALUES (default, ?, ?);";
		
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, usuario.getLogin());
		stmt.setString(2, usuario.getSenha());
		
		try{
			stmt.execute();
			stmt.close();
			
			autenticado = true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return autenticado;
	}
	
	public boolean Update (Usuario usuario) throws Exception{
		sql = "UPDATE usuario SET login = ?, senha = ? WHERE id = ? ";
		
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, usuario.getLogin());
		stmt.setString(2, usuario.getSenha());
		stmt.setInt(3, usuario.getId());
		
		try{
			stmt.execute();
			stmt.close();
			
			autenticado = true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return autenticado;
	}
	
	public boolean Delete (String id) throws Exception{
		sql = "DELETE FROM usuario WHERE id = ? ";
		
		stmt = conn.prepareStatement(sql);
		stmt.setInt(1, Integer.parseInt(id));
		
		try{
			stmt.execute();
			stmt.close();
			
			autenticado = true;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return autenticado;
	}
	
	public ArrayList <Usuario> getUsuarios(){
		
		ArrayList <Usuario> usuarios = new ArrayList <Usuario>();
		
		try{	
			stmt =  conn.prepareStatement("SELECT * FROM usuario");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Usuario u = new Usuario();
				
				u.setId(rs.getInt("id"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));

				usuarios.add(u);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return usuarios;
	}
}
