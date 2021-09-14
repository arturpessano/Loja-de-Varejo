package entidades;

public class Transportadora {
private String nome;
private String endereco;
private String cpf;
private String transporte;
private String frota;








public Transportadora(String nome, String endereco, String cpf, String transporte, String frota) {
	this.nome = nome;
	this.endereco = endereco;
	this.cpf = cpf;
	this.transporte = transporte;
	this.frota = frota;
}

//Getters

public String getNome() {
	return this.nome;
}

public String getEndereco() {
	return this.endereco;
}

public String getCpf() {
	return this.cpf;
}

public String getTransporte() {
	return this.transporte;
}

public String getFrota() {
	return this.frota;
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

public void setTransporte(String transporte) {
	this.transporte = transporte;
}

public void setFrota(String frota) {
	this.frota = frota;
}
@Override
public String toString() {
	return String.format("Nome: %s\tEndereço: %s\tCpf: %s\tTransporte: %s\tFrota: %s",this.nome,this.endereco,this.cpf,this.transporte,this.frota);
	
			
}
}
