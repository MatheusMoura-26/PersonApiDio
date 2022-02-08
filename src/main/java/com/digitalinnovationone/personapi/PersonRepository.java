package com.digitalinnovationone.personapi;

import com.digitalinnovationone.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
