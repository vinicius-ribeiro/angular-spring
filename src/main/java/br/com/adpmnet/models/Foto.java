package br.com.adpmnet.models;

public class Foto {

	private String url;
	private String titulo;
	private Double largura;
	private Double altura;
	
	public Foto(String url, String titulo, Double largura, Double altura) {
		super();
		this.url = url;
		this.titulo = titulo;
		this.largura = largura;
		this.altura = altura;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
}
