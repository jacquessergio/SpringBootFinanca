package br.com.boot.financa.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Usuario extends GenericID {

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String login;

	@Column(nullable = false)
	private String senha;

	public static List<Usuario> listUsuario;

	static {
		adicionaLista();
	}
	

	public Usuario(Long id, String nome, String login, String senha) {
		super(id);
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public Usuario() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static void adicionaLista() {
		
		listUsuario = new ArrayList<>(Arrays.asList(new Usuario(1L, "Goku", "goku@goku.com", "123")));
	}

	public static List<Usuario> getListUsuario() {
		return listUsuario;
	}

	public static void setListUsuario(List<Usuario> listUsuario) {
		Usuario.listUsuario = listUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", login=" + login + ", senha=" + senha + "]";
	}
	
	
}
