
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
    public boolean prenotaPosto(int posto) throws Exception{
        if (posto < 0 || posto >= posti.length) {
            throw new IllegalArgumentException("Numero di posto non valido");
        }
        if (!posti[posto]) {
            posti[posto] = true;
            return true; // Prenotazione riuscita
        } else {
            return false; // Posto già prenotato
        }
    }

    //annulla prenotazione
    public boolean annullaPrenotazione(int posto) throws Exception {
        if (posto >= 0 && posto < posti.length) {
            if (posti[posto]) {
                posti[posto] = false;
                return true; // annullamento riuscito
            } else {
                return false; // posto non prenotato
            }
        } else {
            throw new Exception("Posto non valido");
        }
    }

    //verifica se uno un posto è disponibile
    public boolean isPostoDisponibile(int posto) throws Exception {
       if(posto < 0 || posto >= posti.length){
        throw new Exception("Posto non valido");
       }
       return !posti[posto];
    }

     public String postiDisponibili(int[] numeriPosti) {
        try {
            for (int posto : numeriPosti) {
                if (posto < 0 || posto >= posti.length) {
                    throw new IllegalArgumentException("Numero di posto non valido: " + posto);
                }
                if (posti[posto]) {
                    return posto + " non è disponibile"; 
                }
            }
            return "Tutti i posti sono disponibili!"; 
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

}
