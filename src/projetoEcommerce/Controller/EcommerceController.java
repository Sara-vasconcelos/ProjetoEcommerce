package projetoEcommerce.Controller;

import java.util.ArrayList;


import projetoEcommerce.model.Ecommerce;
import projetoEcommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {
	
	private ArrayList<Ecommerce> listaProdutos = new ArrayList<Ecommerce>();
	int id =0;

	@Override
	public void procurarPorNumero(int id) {//numero
		var produto = buscarNaCollection(id);

		if (produto != null)
			produto.visualizar();

		else

			System.out.println("\n O produto com o ID  " + id + " não foi encontrado");
		
	}

	@Override
	public void listarTodas() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Ecommerce produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto número " + produto.getId()+ " foi adicionado com sucesso!");
		
		
	}

	@Override
	public void atualizar(Ecommerce produto) {
var buscaProduto = buscarNaCollection(produto.getId());
		
		if(buscaProduto !=null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nConta número : "+ produto.getId() + " foi atualizada com sucesso!");
		}else {
			System.out.println("\nConta número : "+ produto.getId() + " não foi encontrada!");
		}
		
	}

	@Override
	public void deletar(int id) {
		var produto = buscarNaCollection(id);
		if(produto !=null) {
			
			if(listaProdutos.remove(produto) == true) 
				System.out.println("\nO produto com o ID "+ id + " foi deletado com sucesso!");
		}
			else 
				
				System.out.println("\nO produto com o ID "+ id + " não foi  encontrado!");
			
		
		
	}

	
	
	public int gerarNumero() {
		return ++id;// a cada conta criada ele gera um número , somando +1 . Ele pegou a variavel
						// numero que valia zero , e a cada conta criada ele acrescenta 1 , então fica
						// assim: 1,2,3,4....
	}
	
	public Ecommerce buscarNaCollection(int id) {
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}

		return null;
	}

}
