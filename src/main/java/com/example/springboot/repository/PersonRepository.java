package com.example.springboot.repository;

import com.example.springboot.entity.Person;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PersonRepository extends ListCrudRepository<Person,Long> {

    List<Person> findByName(String name);
}
