package com.sportcenter.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportcenter.model.Utente;
import com.sportcenter.repository.UtenteRepository;





@RequestMapping("/api/utentes")
@RestController
public class UtenteController {

    @Autowired
    private UtenteRepository utenteRepository;

    @GetMapping
    public List <Utente> getAllUtente() {
        return utenteRepository.findAll();
    }
    @GetMapping("/{id}")
    public Utente getUtenteById(@PathVariable Long id) {
        return utenteRepository.findById(id).get();
    }

    @PostMapping
    public Utente createUtente (@RequestBody Utente utente) {
        return utenteRepository.save(utente);
        
    }
    
    @DeleteMapping("/{id}")
    public void deleteUtente(@PathVariable Long id) {
        utenteRepository.deleteById(id);
    }
    
    
    
    
}
