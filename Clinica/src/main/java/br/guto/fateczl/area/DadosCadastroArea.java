package br.guto.fateczl.area;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroArea(
		
		@NotBlank
		String descricao) {

}
