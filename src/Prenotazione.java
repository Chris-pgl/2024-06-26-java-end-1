
public class Prenotazione {

    /* 
 * ES1: Sistema di Prenotazioni
 * 
 * Crea una classe Prenotazione che possa essere utilizzata da un teatro per
 * tenere traccia delle prenotazioni dei posti. Utilizza un array di booleani
 * per rappresentare i posti: true se il posto è prenotato, false altrimenti.
 * Implementa metodi per prenotare un posto, annullare la prenotazione e
 * verificare se un o piu' posti sono disponibili.
     */
    private boolean[] posti;

    public Prenotazione(int numPosti) {
        this.posti = new boolean[numPosti];
    }

    //prenota posto
    public boolean prenotaPosto(int posto) {
        if (posto < 0 || posto >= posti.length && !posti[posto]) {
            posti[posto] = true;
            return true;
        }
        return false;
    }

    //annulla prenotazione
    public boolean annullaPrenotazione(int posto) {
        if (posto < 0 || posto >= posti.length && posti[posto]) {
            posti[posto] = false;
            return true;
        }
        return false;
    }

    //verificare se un o piu' posti sono disponibili
     public boolean verificaDisponibilità(int posto) {
        return posto >= 0 && posto < posti.length && !posti[posto];
    }

    public boolean[] getPosti() {
        return posti;
    }




}
