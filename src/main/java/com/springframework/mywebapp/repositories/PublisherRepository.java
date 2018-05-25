package com.springframework.mywebapp.repositories;

import com.springframework.mywebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
