package br.guto.fateczl.area;

public record DadosListagemArea(
	Long id,
	String descricao) {
	public DadosListagemArea (Area area) {
	    this(area.getId(),
		area.getDescricao()); 
	}
}
