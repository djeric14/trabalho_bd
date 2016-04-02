package br.fa7.model;

public class Proprietario {
	
	private Long codigo;
	private String nome;
	private String endereco;
	private String celular;
	
	public Proprietario() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCelular() {
		return celular;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
}
