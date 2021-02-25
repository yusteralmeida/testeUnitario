package br.ce.wcaquino.builders;

import br.ce.wcaquino.entidades.Usuario;

/**
 * Chaining Method = Método de Encadeamento
 **/
public class UsuarioBuilder {

	private Usuario usuario;

	private UsuarioBuilder() {
	}

	public static UsuarioBuilder umUsuario() {
		UsuarioBuilder builder = new UsuarioBuilder();
		builder.usuario = new Usuario();
		builder.usuario.setNome("Usuario 1");
		return builder;
	}

	public Usuario agora() {
		return usuario;
	}
	
	public UsuarioBuilder comNome(String nome) {
		usuario.setNome(nome);
		return this;
	}

}
