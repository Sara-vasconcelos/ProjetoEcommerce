package ecommerce.model;

import java.util.Scanner;

public class SetorVarejista extends Ecommerce {
	

	private int validade;
	
	public SetorVarejista(int numeroProduto, int id, int tipoDeProduto, String nomeDoProduto, int quantidade,
			int  validade) {
		super(numeroProduto, id, tipoDeProduto, nomeDoProduto, quantidade);
		this.validade = validade;
	
	}

	public int isValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}

	
	
	@Override
	public boolean deletar (int retirar ) {
		

		
		
	if(getQuantidade()  < retirar  ) {
		System.out.println("\nNão temos essa quantidade em estoque para retirar!");
		return false;
	}
	this.setQuantidade(this.getQuantidade() - retirar); // Atualizar o saldo , fazendo o saldo anterior menos o valor . 
	return true;
	
	
}
	
	@Override
	public void visualizar() {
		super.visualizar(); //Vai rodar o visualizar da classe Conta , e vai acrescentar a linha debaixo LIMITE. Nesse caso , eu não preciso escrever tudo de novo
		System.out.println("\nQuantidade atual : " + this.getQuantidade());
	}
		
	
}
