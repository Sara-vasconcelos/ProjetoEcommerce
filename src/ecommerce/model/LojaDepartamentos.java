package ecommerce.model;

public class LojaDepartamentos extends Ecommerce {
	
	private String CategoriaSexo;

	public LojaDepartamentos(int numeroProduto, int id, int tipoDeProduto, String nomeDoProduto, int quantidade,
			String categoriaSexo) {
		super(numeroProduto, id, tipoDeProduto, nomeDoProduto, quantidade);
		CategoriaSexo = categoriaSexo;
	}

	public String getCategoriaSexo() {
		return CategoriaSexo;
	}

	public void setCategoriaSexo(String categoriaSexo) {
		CategoriaSexo = categoriaSexo;
	}

	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println(" A Categoria do produto é : " + this.getCategoriaSexo());
	}
}
