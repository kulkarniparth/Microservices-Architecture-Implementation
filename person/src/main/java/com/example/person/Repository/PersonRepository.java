package com.example.person.Repository;

import com.example.person.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
    Person findByPersonId(Long personId);
}
