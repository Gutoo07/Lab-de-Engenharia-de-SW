package br.guto.fateczl.area;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoArea(
	@NotNull
	Long id,
	String descricao) {
}
