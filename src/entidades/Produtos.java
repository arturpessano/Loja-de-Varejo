package entidades;

public class Produtos {
private String validade;
private String entrega;
private String envio;
private String endereco;
private String compra;






public Produtos(String validade, String entrega, String envio, String endereco, String compra) {
	this.validade = validade;
	this.entrega = entrega;
	this.envio = envio;
	this.endereco = endereco;
	this.compra = compra;
}

//Getters

public String getValidade() {
	return this.validade;
}

public String getEntrega() {
	return this.entrega;
}

public String getEnvio() {
	return this.envio;
}

public String getEndereco() {
	return this.endereco;
}

public String getCompra() {
	return this.compra;
}



//Setters


public void setValidade(String validade) {
	this.validade = validade;
}

public void setEntrega(String entrega) {
	this.entrega = entrega;
}

public void setEnvio(String envio) {
	this.envio = envio;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public void setCompra(String compra) {
	this.compra = compra;
}

@Override
public String toString() {
	return String.format("Validade: %s\tEntrega: %s\tEnvio: %s\tEndereço: %s\tCompra: %s",this.validade,this.entrega,this.envio,this.endereco,this.compra);
}
}



