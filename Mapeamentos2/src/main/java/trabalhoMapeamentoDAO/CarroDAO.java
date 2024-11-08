package dao;

import util.JPAUtil;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import classes.inheritance.joined.*;

public class CarroDAO {

	private EntityManager em;

	public AlunoDAO() {
	}

	public boolean salvar(Carro entity) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		}
	}

	public boolean atualizar(Carro entity) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		} 
	}

	public boolean remover(long id) {
		try {
			em = JPAUtil.getEntityManager();
			em.getTransaction().begin();
			Carro entity = em.find(Carro.class, id);
			em.remove(entity);
			em.getTransaction().commit();
			return true;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return false;
		} 
	}

	public Carro buscarID(int id) {
		try {
			em = JPAUtil.getEntityManager();
			Carro entity = em.find(Carro.class, id);
			return entity;
		} catch (RuntimeException e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			return null;
		} 
	}

	public List<Carro> buscarTodos() {
		try {
			em = JPAUtil.getEntityManager();
			TypedQuery<Carro> query = em.createQuery("SELECT obj FROM Carro obj", Carro.class);
			List<Carro> alunos = query.getResultList();
			return alunos;
		} catch (RuntimeException e) {
			//e.printStackTrace();
			return null;
		} 
	}
}
