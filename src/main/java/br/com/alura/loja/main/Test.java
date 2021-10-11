package br.com.alura.loja.main;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.Produtodao;
import br.com.alura.loja.model.Categoria;
import br.com.alura.loja.model.Produto;
import br.com.alura.loja.util.JPAUtil;

public class Test {

	public static void main(String[] args) {
		
		Categoria celulares = new Categoria("Teste");
		
		Produto celular = new Produto("Iphone 6s", "64GB", new BigDecimal("1000"), celulares );
		celular.setDataCadastro(LocalDate.of(2020, 12, 01));
		
		EntityManager em = JPAUtil.getEntityManager();
		Produtodao produtoDao = new Produtodao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		em.getTransaction().begin();
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);
		
		//List<Produto> n = produtoDao.buscarPorNome("Iphone 6s");
		//n.forEach(a -> System.out.println(a.getDataCadastro()));
		//List<Categoria> po =categoriaDao.buscarTodos();
		
		em.getTransaction().commit();
		
		
	}

}
