package puntispesa;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * Classe che implementa il servizio REST SaldoPunti.
 * 
 * Il servizio è offerto al path "/saldopunti".
 */
@Path("/saldopunti")
@Produces(MediaType.APPLICATION_JSON)
public class PuntiSpesa {
    
    // Saldo punti iniziale per i nuovi utenti
    private int saldoIniziale;
    
    public PuntiSpesa(int saldoIniziale) {
        this.saldoIniziale = saldoIniziale;
    }
    
    // Metodo GET per il reperimento del saldo punti di un utente
    @GET
    @Path("/{matricola}")
    public Response getSaldoPunti(@PathParam("matricola") int matricola) {
        
        // Restituzione di "404 Not Found"
        // (nessun utente memorizzato ha la matricola indicata)
        return Response.status(Status.NOT_FOUND)
                .entity("Saldo punti non disponibile.")
                .type(MediaType.TEXT_PLAIN)
                .build();
    }

}
