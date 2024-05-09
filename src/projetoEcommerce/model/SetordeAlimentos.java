package projetoEcommerce.model;

public class SetordeAlimentos extends Ecommerce {

	//limite tipo float
	private  String validade;
	
	

	public SetordeAlimentos(int id, int quantidade, int tipo, String nome, float preco, String validade) {
		super(id, quantidade, tipo, nome, preco);
		this.validade = validade;
	}



	public String getValidade() {
		return validade;
	}



	public void setValidade(String validade) {
		this.validade = validade;
		}
//	
//	@Override //indicando que o Método foi sobrescrito
//	public boolean deletar (float valor) {
//	if(getSaldo() + this.getLimite() < valor ) {
//		System.out.println("\nSaldo Insuficiente!");
//		return false;
//	}
//	this.setSaldo(this.getSaldo() - valor); // Atualizar o saldo , fazendo o saldo anterior menos o valor . 
//	return true;
//		
//	}
	
	@Override
	public void visualizar() {
		super.visualizar(); 
		System.out.println("\nValidade atual do produto : " + this.validade);
	}

}
