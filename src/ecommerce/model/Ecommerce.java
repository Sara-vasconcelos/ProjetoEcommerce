package ecommerce.model;


public  abstract class Ecommerce {
	
	private int numeroProduto;
	private int id;
	private int tipoDeProduto;
	private String nomeDoProduto;
	private int quantidade;
	public Ecommerce(int numeroProduto, int id, int tipoDeProduto, String nomeDoProduto, int quantidade) {
		this.numeroProduto = numeroProduto;
		this.id = id;
		this.tipoDeProduto = tipoDeProduto;
		this.nomeDoProduto = nomeDoProduto;
		this.quantidade = quantidade;
	}
	public int getNumeroProduto() {
		return numeroProduto;
	}
	public void setNumeroProduto(int numeroProduto) {
		this.numeroProduto = numeroProduto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTipoDeProduto() {
		return tipoDeProduto;
	}
	public void setTipoDeProduto(int tipoDeProduto) {
		this.tipoDeProduto = tipoDeProduto;
	}
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//método criado para deletar produtos , caso não tenha nada para retirar , aparecerá essa mensagem
	public boolean deletar(int valor ) {
		if(this.getQuantidade()< valor) {
			System.out.println("\n Não há produtos desse setor para deletar!");
			return false;
		}
		
		this.setQuantidade(this.getQuantidade() - valor);
		return true;
	}
	
	//Método para cadastrar novos produtos , mostrando a quantidade atual e a final após a inclusão
	public void Cadastrar(int valor ) {
		this.setQuantidade(this.getQuantidade()+valor);
	}
	
	public void visualizar() {
		String tipoDeProduto = "";
		
		switch(this.tipoDeProduto){
		case 1:
			tipoDeProduto = "Setor Varejista";
			break;
			
		case 2:
			tipoDeProduto = "Loja de Departamentos";
			break;
			
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do produto:");
		System.out.println("***********************************************************");
		System.out.println("Numero do Produto: " + this.numeroProduto);
		System.out.println("Identificador: " + this.id);
		System.out.println("Tipo do Produto: " + tipoDeProduto);
		System.out.println("Nome do Produto: " + this.nomeDoProduto);
		System.out.println("Quantidade: " + this.quantidade);
		
		
	}
}
