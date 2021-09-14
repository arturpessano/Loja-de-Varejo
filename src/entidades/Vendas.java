package entidades;

public class Vendas {
private String nome;
private String endereco;
private String cpf;
private String entrega;






public Vendas(String nome, String endereco, String cpf, String entrega) {
	this.nome = nome;
	this.endereco = endereco;
	this.cpf = cpf;
	this.entrega = entrega;
}

//Getters

public String getNome() {
	return this.nome;
}

public String getEndereco() {
	return  this.endereco;
}

public String getCpf() {
	return this.cpf;
}

public String getEntrega() {
	return this.entrega;
}



//Setters

public void setNome(String nome) {
	this.nome = nome;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public void setEntrega(String entrega) {
	this.entrega = entrega;
}
@Override
public String toString() {
	return String.format("Nome: %s\tEnderteço: %s\tCpf: %s\tEntrega: %s",this.nome,this.endereco,this.cpf,this.entrega);
}

}
