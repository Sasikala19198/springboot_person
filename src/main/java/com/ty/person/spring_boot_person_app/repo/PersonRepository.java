package com.ty.person.spring_boot_person_app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.person.spring_boot_person_app.dto.Person;

public interface PersonRepository extends JpaRepository<Person,Integer> {
	

}
