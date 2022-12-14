package com.qa.dto.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.qa.dto.model.Person;
import com.qa.dto.model.PersonDTO;
import com.qa.dto.repo.PersonRepo;

@Service
public class PersonService
{
	private PersonRepo repo;
	private ModelMapper mapper;

    public PersonService(PersonRepo repo, ModelMapper mapper) {
        super();
        this.repo = repo;
        this.mapper = mapper;
    }
    
    //uses the method mapper to convert a person to person DTO
    private PersonDTO mapToDTO(Person person)
    {
        return this.mapper.map(person, PersonDTO.class);
    }
    
    public PersonDTO addPerson(Person person)
    {
    	Person saved =  this.repo.save(person);
        return this.mapToDTO(saved);
    }
    
    public List<PersonDTO> getAllPeople() // uses a stream with map
    {
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

	//UPDATE
    public PersonDTO updatePerson(Long id, Person newPerson)
    {
        Optional<Person> existingOptional = this.repo.findById(id);
        Person existing = existingOptional.get();

        existing.setAge(newPerson.getAge());
        existing.setName(newPerson.getName());

        Person updated =  this.repo.save(existing);
        return this.mapToDTO(updated);
    }

    public boolean removePerson(Long id) {
        this.repo.deleteById(id);
        boolean exists = this.repo.existsById(id);
        return !exists;
    }
}
