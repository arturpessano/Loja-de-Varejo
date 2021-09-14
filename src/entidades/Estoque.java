package entidades;

public class Estoque {
private String quantidade;
private String preco;
private String compra;
private String transporte;






public Estoque(String quantidade, String preco, String compra, String transporte) {
	this.quantidade = quantidade;
	this.preco = preco;
	this.compra = compra;
	this.transporte = transporte;
}

//Getters

public String getQuantidade() {
	return this.quantidade;
}

public String getPreco() {
	return this.preco;
}

public String getCompra() {
	return this.compra;
}

public String getTransporte() {
	return this.transporte;
		
}

//Setters

public void setQuantidade(String quantidade) {
	this.quantidade = quantidade;
}

public void setPreco(String preco) {
	this.preco = preco;
}

public void setCompra(String compra) {
	this.compra = compra;
}

public void setTransporte(String transporte) {
	this.transporte = transporte;
}

@Override
public String toString(){
	return String.format("Quantidade: %s\tPreço: %s\tCompra: %s\tTransporte: %s",this.quantidade,this.preco,this.compra,this.transporte);	
}

}