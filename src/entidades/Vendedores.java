package entidades;

import java.time.LocalDate;

public class Vendedores {
	private String nome;
	private String telefone;
	private String endereco;
	private LocalDate datadenacimento;
	private String carteiradetrabalho;

	public Vendedores(String nome, String telefone, String endereco, LocalDate datadenacimento,
			String carteiradetrabalho) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.datadenacimento = datadenacimento;
		this.carteiradetrabalho = carteiradetrabalho;
	}

//Getters

	public String getNome() {
		return this.nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

public String getEndereco() {
	return this.endereco;
}

	public LocalDate getDatadenacimento() {
		return this.datadenacimento;
	}

	public String getCarteiradetrabalho() {
		return this.carteiradetrabalho;
	}

//Setters

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setDatadenacimento(LocalDate datadenacimento) {
		this.datadenacimento = datadenacimento;
	}

	public void setCarteiradetrabalho(String carteiradetrabalho) {
		this.carteiradetrabalho = carteiradetrabalho;
	}
	@Override
	public String toString() {
		return String.format("Nome: %s\tTelefone: %S\tEdendereço: %s\tDatadeinternação: %s\tCArteiradetrabalho: %s", this.nome,this.telefone,this.endereco,this.datadenacimento,this.carteiradetrabalho);
	}
}
