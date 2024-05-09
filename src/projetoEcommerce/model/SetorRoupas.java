package projetoEcommerce.model;

public class SetorRoupas extends Ecommerce{

	
	private String categoria;
	
	

	public SetorRoupas(int id, int quantidade, int tipo, String nome, float preco, String categoria) {
		super(id, quantidade, tipo, nome, preco);
		this.categoria = categoria;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Categoria: " + this.categoria);
	}

}
