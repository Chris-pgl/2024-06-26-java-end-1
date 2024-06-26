package SeggioElettorale;
public class Elettore {
        /*
 * ES5: Sistema di Votazione
 * 
 * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
 * Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
 * ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
 * doppi voti o voti a candidati non esistenti.
 */ 

    private String name;

    private boolean hasVoted;

    public Elettore(String name){
        this.name = name;
        this.hasVoted = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    public void vota() throws Exception{
        if(hasVoted == true){
            throw new Exception("Ha già votato");
        }
        hasVoted = true;
    }
    
}
