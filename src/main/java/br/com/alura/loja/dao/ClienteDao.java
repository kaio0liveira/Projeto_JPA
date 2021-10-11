package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja.model.Cliente;

public class ClienteDao {

	EntityManager em;

	public ClienteDao(EntityManager e) {

		this.em = e;
	}

	public void cadastrar(Cliente cliente) {
		this.em.persist(cliente);
	}
	
	public Cliente buscarPorId(Long id) {
		return this.em.find(Cliente.class, id);
	}

	
	

}
