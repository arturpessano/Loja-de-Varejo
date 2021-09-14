package entidades;

public class Clientes {
private String nome;
private String email;
private String endereco;
private String rg;
private String cpf;


public Clientes (String nome, String email, String endereço,String rg,String cpf, String endereco) {
    this.nome = nome;
    this.email = email;
    this.endereco = endereco;
    this.rg = rg;
    this.cpf = cpf;
}
//Getters

public String getnome() {
	return this.nome;
}
public String getEmail() {
	return this.email;
}

public String getEndereco() {
	return this.endereco;
}

public String getRg() {
	return this.rg;
}

public String getCpf() {
	return this.cpf;
}


//Setters

public void setnome (String nome) {
	this.nome = nome;
}
public void setEmail (String email) {
    this.email = email;
}

public void setEndereco (String endereco) {
	this.endereco = endereco;
}

public void setRG (String rg) {
	this.rg = rg;
}

public void setCpf (String cpf) {
	this.rg = cpf;
}
			
	@Override
	public String toString(){
		return String.format("Nome: %s\tEmail: %s\tEndereço\tRg: %s\tCpf: %s", this.nome,this.email,this.endereco,this.rg,this.cpf.toString());
	}
			
}