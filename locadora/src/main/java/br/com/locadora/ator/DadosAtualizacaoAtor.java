package br.com.locadora.ator;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoAtor(
	@NotNull
	Long id,
	String titulo,
	String pais) {
}
