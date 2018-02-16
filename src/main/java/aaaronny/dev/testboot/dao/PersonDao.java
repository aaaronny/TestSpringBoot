package aaaronny.dev.testboot.dao;

import java.util.List;

import aaaronny.dev.testboot.model.Person;

public interface PersonDao {

	public List<Person> findAll();
	public void add(Person person);

}
