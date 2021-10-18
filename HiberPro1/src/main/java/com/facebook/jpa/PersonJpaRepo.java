package com.facebook.jpa;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.facebook.bean.Person;

@Repository
@Transactional
public class PersonJpaRepo {

@PersistenceContext
EntityManager enitiyManager;
	
public Person findById(int id) {
	
	return enitiyManager.find(Person.class,id);
}

public Person update(Person person) {
	
	return enitiyManager.merge(person);
}
	
}
