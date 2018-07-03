package puntispesa;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

/**
 * Classe di configurazione.
 * 
 * Consente di utilizzare un file di configurazione per settare il 
 * saldo punti iniziale da associare ad un nuovo utente.
 * 
 * (Il file di configurazione è "config-puntispesa.yml")
 */
public class PuntiSpesaConfig extends Configuration {
    
    private int saldoIniziale;
    
    @JsonProperty
    public int getSaldoIniziale() {
        return saldoIniziale;
    }
    
    @JsonProperty
    public void setSaldoIniziale(int punti) {
        this.saldoIniziale = punti;
    }
    
}
