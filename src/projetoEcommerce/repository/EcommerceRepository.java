package projetoEcommerce.repository;

import projetoEcommerce.model.Ecommerce;

public interface EcommerceRepository {
	
	
	// CRUD 
		public void procurarPorNumero(int numero);
		public void listarTodas();
		public void cadastrar(Ecommerce produto);//conta
		public void atualizar(Ecommerce produto);//conta
		public void deletar(int numero);
		
		

}
