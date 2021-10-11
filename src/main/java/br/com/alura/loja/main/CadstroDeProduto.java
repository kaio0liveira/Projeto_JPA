package br.com.alura.loja.main;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ClienteDao;
import br.com.alura.loja.dao.PedidoDao;
import br.com.alura.loja.dao.Produtodao;
import br.com.alura.loja.model.Categoria;
import br.com.alura.loja.model.Cliente;
import br.com.alura.loja.model.ItemPedido;
import br.com.alura.loja.model.Pedido;
import br.com.alura.loja.model.Produto;
import br.com.alura.loja.util.JPAUtil;
import br.com.alura.loja.vo.RelatorioDeVendasVo;
public class CadstroDeProduto {
	
	public static void main(String[] args) {
		
		cadastroProduto();

		EntityManager em = JPAUtil.getEntityManager();
		Produtodao produtoDao = new Produtodao(em);
		PedidoDao pedido = new PedidoDao(em);
		//ClienteDao clienteDao = new ClienteDao(em);
		Pedido p =pedido.buscarPedidoComCliente(1l);
		em.close();
		System.out.println(p.getCliente().getNome());
//		Produto produto = produtoDao.buscarPorId(1l);
//		Produto produto2 = produtoDao.buscarPorId(2l);
//		Produto produto3 = produtoDao.buscarPorId(3l);
//		Cliente cliente = clienteDao.buscarPorId(1l);
//		
//		em.getTransaction().begin();
//		
//		Pedido pedido = new Pedido(cliente);
//		pedido.adicionaItem(new ItemPedido(10, pedido, produto));
//		pedido.adicionaItem(new ItemPedido(40, pedido, produto2));
//
//		Pedido pedido2 = new Pedido(cliente);
//		pedido2.adicionaItem(new ItemPedido(2, pedido2, produto3));
//		
//		PedidoDao pedidoDao = new PedidoDao(em);
//		pedidoDao.cadastrar(pedido);
//		pedidoDao.cadastrar(pedido2);
//		
//		em.getTransaction().commit();
//		
//		BigDecimal totalVendido = pedidoDao.valorTotal();
//		System.out.println("VALOR TOTAL: " +totalVendido);
//		
//		
//		List<RelatorioDeVendasVo> relatorio = pedidoDao.relatorioDeVendas();
//		relatorio.forEach(System.out::println);
//		
	}
	
	private static void cadastroProduto(){
//		Categoria celulares = new Categoria("Teste");
//		Cliente cliente = new Cliente("Rodrigo","123456");
//		Produto celular = new Produto("Iphone 6s", "64GB", new BigDecimal("1000"), celulares );
//		celular.setDataCadastro(LocalDate.of(2020, 12, 01));
//		
//		EntityManager em = JPAUtil.getEntityManager();
//		Produtodao produtoDao = new Produtodao(em);
//		ClienteDao clienteDao = new ClienteDao(em);
//		CategoriaDao categoriaDao = new CategoriaDao(em);
//		em.getTransaction().begin();
//		categoriaDao.cadastrar(celulares);
//		produtoDao.cadastrar(celular);
//		
//		clienteDao.cadastrar(cliente);
//		
//		//List<Produto> n = produtoDao.buscarPorNome("Iphone 6s");
//		//n.forEach(a -> System.out.println(a.getDataCadastro()));
//		//List<Categoria> po =categoriaDao.buscarTodos();
//		
//		em.getTransaction().commit();
//		em.close();
//		Categoria celulares = new Categoria("CELULARES");
//		Categoria videogames = new Categoria("VIDEOGAMES");
//		Categoria informatica = new Categoria("INFORMATICA");
//		
//		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares);
//		Produto videogame = new Produto("PS5", "Playstation 5", new BigDecimal("8000"), videogames);
//		Produto macbook = new Produto("Macbook", "Macboo pro retina", new BigDecimal("14000"), informatica);
//		
//		Cliente cliente = new Cliente("Rodrigo", "123456");
//		
//		EntityManager em = JPAUtil.getEntityManager();
//		Produtodao produtoDao = new 	Produtodao(em);
//		CategoriaDao categoriaDao = new CategoriaDao(em);
//		ClienteDao clienteDao = new ClienteDao(em);
//		
//		em.getTransaction().begin();
//		
//		categoriaDao.cadastrar(celulares);
//		categoriaDao.cadastrar(videogames);
//		categoriaDao.cadastrar(informatica);
//		
//		produtoDao.cadastrar(celular);
//		produtoDao.cadastrar(videogame);
//		produtoDao.cadastrar(macbook);
//		
//		clienteDao.cadastrar(cliente);
//		
//		em.getTransaction().commit();
//		em.close();
	}

}
