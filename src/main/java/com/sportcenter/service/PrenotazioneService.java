package com.sportcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportcenter.dto.PrenotazioneRequest;
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

    public Prenotazione create( PrenotazioneRequest request) {
        //recuperare l'utente dal repository UtenteRepository
        Utente utente = utenteRepository.findById(request.getUtenteId()).get();
        //recuperare l'utente dal repository CampoSportivoRepository
        CampoSportivo campoSportivo = campoSportivoRepository.findById(request.getCamposportivoId()).get();
        //settare i valori in oggetto Prenotazione
        Prenotazione prenotazioneToSave = new Prenotazione();

        prenotazioneToSave.setDataOra(request.getDataOra());
        prenotazioneToSave.setStato(request.getStato());
        prenotazioneToSave.setCampoSportivo(campoSportivo);
        prenotazioneToSave.setUtente(utente);
        
        //salvare
        prenotazioneToSave = prenotazioneRepository.save(prenotazioneToSave);
       


    return prenotazioneToSave;
    
}
}
