package com.springframework.mywebapp.repositories;

import com.springframework.mywebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
