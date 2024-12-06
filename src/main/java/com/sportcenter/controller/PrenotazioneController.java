package com.sportcenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportcenter.controller.request.PrenotazioneRequest;
import com.sportcenter.model.Prenotazione;
import com.sportcenter.repository.PrenotazioneRepository;

@RequestMapping("/api/prenotaziones")
@RestController
public class PrenotazioneController {
     @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @GetMapping
    public List <Prenotazione> getAllPrenotazione() {
        return prenotazioneRepository.findAll();
    }
    @GetMapping("/{id}")
    public Prenotazione getPrenotzioneById(@PathVariable Long id) {
        return prenotazioneRepository.findById(id).get();
    }

    @PostMapping("/{playlistId}/song")
    public Prenotazione create (@RequestBody PrenotazioneRequest prenotazioneRequest) {
            
    
        Prenotazione updatedPrenotazione = prenotazioneService.addPrenotazioneRequest(prenotazioneId, request.getUtenteId());
        return ResponseEntity.ok(updatedPrenotazione);

    
        return prenotazioneService.save(prenotazioneRequest);
        
    }
    
    @DeleteMapping("/{id}")
    public void deletePrenotazione(@PathVariable Long id) {
        prenotazioneRepository.deleteById(id);
    }
    
}
