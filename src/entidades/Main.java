package entidades;



public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando um objeto
		Clientes cli = new Clientes();
		Estoque pac1 = new Estoque();
		
		
		
		cli.nome = "Artur pessano";
		cli.email = "arturnp";
		cli.endereco = "Rua sem nome";
		cli.rg = "0000";
		cli.cpf = "0000";
		
		pac1.quantidade = "10";
		pac1.preco = "100";
		pac1.compra = "100";
		pac1.transporte = "2hrs";
		
		//Imprimir dados
				System.out.printf("O senhor %s do email %s mora na rua %s rg %s cpf %s",cli.nome,cli.email,cli.endereco,cli.rg,cli.cpf);
	}
		
		
				
		
		
		
}
