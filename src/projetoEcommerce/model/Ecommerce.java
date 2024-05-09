package projetoEcommerce.model;



public abstract class Ecommerce {

	
	private int id;
	private int quantidade;
	private int tipo;
	private String nome;
	private float preco;
	public Ecommerce(int id, int quantidade, int tipo, String nome, float preco) {
		this.id = id;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	//sacar
	public boolean deletar (int valor) {
		if(this.getQuantidade()< valor) {
			System.out.println("\n Não temos essa quantidade em estoque para retirar!");
			return false;
		}
		
		this.setQuantidade(this.getQuantidade() - valor);
		return true;
	}
	
	//depositar
	public void cadastrar(int valor ) {
		this.setQuantidade(this.getQuantidade()+valor);
	}
	
	public void visualizar() {
		String tipo = "";
		
		switch(this.tipo){
		case 1:
			tipo = "Setor de Alimentos";
			break;
			
		case 2:
			tipo = "Setor de Roupas";
			break;
			
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do produto:");
		System.out.println("***********************************************************");
		System.out.println("Id do produto: " + this.id);
		System.out.println("Preço: " + this.preco);
		System.out.println("Tipo de Setor: " + tipo);
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Quantidade: " + this.quantidade);
}
}
