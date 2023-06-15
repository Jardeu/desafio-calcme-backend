package com.calcme.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calcme.agenda.model.Contato;
import com.calcme.agenda.repository.ContatoRepository;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;

    public void salvarContato(Contato contato) {
        contatoRepository.save(contato);
    }

}
