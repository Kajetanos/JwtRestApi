package com.rest.jwt.model.repository;

import com.rest.jwt.model.entity.Candy;
import org.springframework.data.repository.CrudRepository;

public interface CandyRepository extends CrudRepository<Candy, Long> { }

