package puntispesa;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Classe di rappresentazione di un saldo punti.
 * 
 * Consente di rappresentare le risorse scambiate tra client
 * e servizio (ovvero il saldo punti di un utente).
 */
public class SaldoPunti {
    
    // Matricola dell'utente
    private int matricola;
    // Punti accumulati
    private int punti;
    
    public SaldoPunti() {
        // Ci pensa Jackson
    }
    
    public SaldoPunti(int matricola, int punti) {
        this.matricola = matricola;
        this.punti = punti;
    }
    
    @JsonProperty
    public int getMatricola() {
        return matricola;
    }
    
    @JsonProperty
    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }
    
}
