package projetoEcommerce.repository;

import ecommerce.model.Ecommerce;

public interface EcommerceRepository {
	// CRUD 
		public void procurarPorNumero(int numero);
		public void listarTodas();
		public void cadastrar(Ecommerce produto);
		public void atualizar(Ecommerce produto);
		public void deletar(int numero);
		
		// Métodos 
		public void retirar(int numero, float valor);
		public void cadastrar(int numero, float valor);
		//public void transferir(int numeroOrigem, int numeroDestino, float valor);

}
