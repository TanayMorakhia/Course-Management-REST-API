package com.project.datajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.datajpa.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
