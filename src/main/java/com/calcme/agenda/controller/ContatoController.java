package com.calcme.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.calcme.agenda.model.Contato;
import com.calcme.agenda.service.ContatoService;

import jakarta.validation.Valid;

@RestController
public class ContatoController {
    @Autowired
    private ContatoService service;

    @PostMapping("/salvar")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> salvarContato(@Valid @RequestBody Contato body, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return ResponseEntity.badRequest().body("Dados de contato inválidos");
        } else {
            service.salvarContato(body);
            return ResponseEntity.ok().body("Contato salvo com sucesso");
        }
    }
}
