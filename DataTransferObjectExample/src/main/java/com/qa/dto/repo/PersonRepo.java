package com.qa.dto.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.dto.model.Person;

public interface PersonRepo extends JpaRepository<Person, Long>
{

}
