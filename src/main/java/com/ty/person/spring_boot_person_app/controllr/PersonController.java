package com.ty.person.spring_boot_person_app.controllr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.person.spring_boot_person_app.dao.PersonDao;
import com.ty.person.spring_boot_person_app.dto.Person;

@RestController
public class PersonController {
	
		@Autowired
		PersonDao personDao;

		@PostMapping("save")
		public Person savePerson(@RequestBody Person person) {
			//System.out.println("saved");
			return personDao.savePerson(person);
			
		}
		@GetMapping("get")
		public Person getPerson(@RequestParam int id) {
			return personDao.getPerson(id);
		}
		@DeleteMapping("delete/{id}")
		public String deleteStudent(@PathVariable int id) {
			return personDao.deletePerson(id);
		}

}
