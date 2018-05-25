package com.springframework.mywebapp.repositories;

import com.springframework.mywebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
