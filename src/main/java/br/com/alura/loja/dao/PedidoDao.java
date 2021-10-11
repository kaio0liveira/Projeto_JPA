package br.com.alura.loja.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.loja.model.Pedido;
import br.com.alura.loja.vo.RelatorioDeVendasVo;

public class PedidoDao {

	EntityManager em;

	public PedidoDao(EntityManager e) {

		this.em = e;
	}

	public void cadastrar(Pedido pedido) {
		this.em.persist(pedido);
	}
	
	public BigDecimal valorTotal() {
		String jpql = "SELECT SUM(p.valorTotal) FROM Pedido p";
		
		return em.createQuery(jpql, BigDecimal.class).getSingleResult();
	}
	
	public Pedido buscarPorId(Long id) {
		return em.find(Pedido.class, id);

	}
	
	/*
	 * Utilizando a função JOIN FETCH, para trazer apenas os resultados do cliente,
	 * quando realizar um select da tabela Pedido.
	 */
	public Pedido buscarPedidoComCliente(Long id) {
		return (Pedido) em.createQuery("SELECT p FROM Pedido p JOIN FETCH p.cliente WHERE p.id = :id")
				.setParameter("id", id).getSingleResult();

	}

	public List<RelatorioDeVendasVo> relatorioDeVendas() {
		String jpql = "SELECT new br.com.alura.loja.vo.RelatorioDeVendasVo("
				+ "produto.nome, "
				+ "SUM(item.quantidade), "
				+ "MAX(pedido.data)) "
				+ "FROM Pedido pedido "
				+ "JOIN pedido.itens item "
				+ "JOIN item.produto produto "
				+ "GROUP BY produto.nome "
				+ "ORDER BY item.quantidade DESC";
		return em.createQuery(jpql, RelatorioDeVendasVo.class)
				.getResultList();
	}


}
