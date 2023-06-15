package com.calcme.agenda.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.calcme.agenda.model.Contato;

public interface ContatoRepository extends MongoRepository<Contato, String> {

}