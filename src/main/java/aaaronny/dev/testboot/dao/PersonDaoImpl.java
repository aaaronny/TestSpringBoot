package aaaronny.dev.testboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import aaaronny.dev.testboot.model.Person;

@Transactional//(rollbackOn = Exception.class)
@Repository
public class PersonDaoImpl implements PersonDao {

	@PersistenceContext	
	private EntityManager em;
	
	@Override
	public List<Person> findAll() {
		List<Person> list = null;
		try{
			list = em.createNamedQuery("Person.findAll", Person.class).getResultList();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
