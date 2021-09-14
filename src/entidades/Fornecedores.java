package entidades;

public class Fornecedores {
private String nome;
private String endereco;
private String telefone;
private String rg;
private String cpf;







public Fornecedores(String nome, String endereco, String telefone, String rg, String cpf) {
	this.nome = nome;
	this.endereco = endereco;
	this.telefone = telefone;
	this.rg = rg;
	this.cpf = cpf;
}

//Getters

public String getNome() {
	return this.nome;
}

public String getEndereco() {
	return this.endereco;
}

public String getTelefone() {
	return this.telefone;
}

public String getRg() {
	return this.rg;
}

public String getCpf() {
	return this.cpf;
}


//Setters


public void setNome(String nome) {
	this.nome = nome;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public void setRg(String rg) {
	this.rg = rg;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

@Override
public String toString() {
	return String.format("Nome: %s\tEndereço: %sTelefone: %s\tRg: %s\tCpf: %s", this.nome,this.endereco,this.telefone,this.rg,this.cpf);
	
}
}





