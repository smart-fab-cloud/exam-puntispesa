package puntispesa;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Classe di esecuzione del servizio.
 * 
 * La classe utilizza la configurazione indicata attraverso il file 
 * di configurazione passato.
 */
public class PuntiSpesaApp extends Application<PuntiSpesaConfig> {

    // Metodo main eseguibile (avvia il server che esegue il servizio)
    public static void main(String[] args) throws Exception {
        new PuntiSpesaApp().run(args);
    }
    
    @Override
    public void run(PuntiSpesaConfig c, Environment e) throws Exception {
        // Creazione di una risorsa REST "ps" di tipo "PuntiSpesa"
        final PuntiSpesa ps = new PuntiSpesa(c.getSaldoIniziale());
        
        // Registrazione della risorsa "ps" sul server di esecuzione
        e.jersey().register(ps);
        
    }
    
    
    
}
