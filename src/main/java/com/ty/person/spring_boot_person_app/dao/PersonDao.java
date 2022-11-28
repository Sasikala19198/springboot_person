package com.ty.person.spring_boot_person_app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.ty.person.spring_boot_person_app.dto.Person;
import com.ty.person.spring_boot_person_app.repo.PersonRepository;

@Repository
public class PersonDao {

	@Autowired
	PersonRepository personRepository;

	public Person savePerson(Person person) {
		return personRepository.save(person);
	}

	public Person getPerson(int id) {
		return personRepository.findById(id).get();
	}

	public String deletePerson(int id) {
		personRepository.deleteById(id);
		return "deleted";
	}

}
