package com.project.datajpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.project.datajpa.models.Author;
import jakarta.transaction.Transactional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    Author findById(int id);
    List<Author> findALlByFirstName(String fn);

    // returns both uppercase and lower case letters
    List<Author> findAllByFirstNameIgnoreCase(String fn);

    // like "%al%"
    List<Author> findALlByFirstNameContainingIgnoreCase(String fn);

    // like "al%"
    List<Author> findALlByFirstNameStartingWithIgnoreCase(String fn);

    // like "%al"
    List<Author> findALlByFirstNameEndingWithIgnoreCase(String fn);

    // in list
    List<Author> findALlByFirstNameInIgnoreCase(List<String> firstNames);

    // to update age where id is given
    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age where a.id = :id")
    void updateWhereAgeWhereIdIs(int age, int id);

}
