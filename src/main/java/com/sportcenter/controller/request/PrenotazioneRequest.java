package com.sportcenter.controller.request;

import java.time.LocalDateTime;

public class PrenotazioneRequest {
    private LocalDateTime dataOra;
    private String stato;
    private Long utenteId;
    private Long campostortivoId;

    public LocalDateTime getDataOra() {
        return dataOra;
    }
    public void setDataOra(LocalDateTime dataOra) {
        this.dataOra = dataOra;
    }
    public Long getCampostortivoId() {
        return campostortivoId;
    }
    public void setCampostortivoId(Long campostortivoId) {
        this.campostortivoId = campostortivoId;
    }
    public String getStato() {
        return stato;
    }
    public void setStato(String stato) {
        this.stato = stato;
    }
    public Long getUtenteId() {
        return utenteId;
    }
    public void setUtenteId(Long utenteId) {
        this.utenteId = utenteId;
    }
    
}
