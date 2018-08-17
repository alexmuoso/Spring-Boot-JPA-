package com.JPA.project.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.JPA.project.models.Cliente;

@Repository("ClienteDaoImpl")
public class ClienteDaoImpl implements ClienteDao {
	
	@PersistenceContext
	EntityManager em ;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Cliente> findAll() {
		return em.createQuery("from Cliente").getResultList(); //Cliente = nombre de la Entity Real
	}

}
