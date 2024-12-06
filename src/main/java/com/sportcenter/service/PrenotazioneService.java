package com.sportcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportcenter.model.CampoSportivo;
import com.sportcenter.model.Prenotazione;
import com.sportcenter.model.Utente;
import com.sportcenter.repository.CampoSportivoRepository;
import com.sportcenter.repository.PrenotazioneRepository;
import com.sportcenter.repository.UtenteRepository;

@Service
public class PrenotazioneService {

    @Autowired
    private CampoSportivoRepository campoSportivoRepository;

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    
    public Prenotazione prenotazioneRequest(Long prenotazioneId, Long utenteId, Long campoSportivoId) {
        Prenotazione prenotazione = prenotazioneRepository.findById(prenotazioneId).orElseThrow(() -> new RuntimeException("prenotazione not found"));


        Utente utente = utenteRepository.findById(utenteId).orElseThrow(() -> new RuntimeException("Utente not found"));
        if (prenotazione.getUtente().add(utente)) {
            UtenteRepository.save(prenotazione);
        }
        return prenotazione;

    

    CampoSportivo campoSportivo =  campoSportivoRepository.findById(campoSportivoId).orElseThrow(() -> new RuntimeException("Campo sportivo not found"));
    if (prenotazione.getCampoSportivo().add(campoSportivo)) {
        CampoSportivoRepository.save(prenotazione);
    }

    return prenotazione;
    
}
}
