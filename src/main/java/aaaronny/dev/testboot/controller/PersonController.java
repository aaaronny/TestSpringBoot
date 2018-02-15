package aaaronny.dev.testboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import aaaronny.dev.testboot.dao.PersonDao;
import aaaronny.dev.testboot.model.Person;

@RestController
public class PersonController {
	
	@Autowired
	PersonDao dao;
	
	@RequestMapping(value="/people", method = RequestMethod.GET, produces="application/json")
    public List<Person> getPerson() {
        return dao.findAll();
    }
}
