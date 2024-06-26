/**
 * TODO:
 * 
 * ES0: Creare un repository su GitHub con il seguente nome:
 * 2024-06-26-java-end-1
 * 
 * Caricare tutti gli esercizi in un unico progetto sulla stessa repo
 * 
 * 
 * ES1: Sistema di Prenotazioni
 * 
 * Crea una classe Prenotazione che possa essere utilizzata da un teatro per
 * tenere traccia delle prenotazioni dei posti. Utilizza un array di booleani
 * per rappresentare i posti: true se il posto è prenotato, false altrimenti.
 * Implementa metodi per prenotare un posto, annullare la prenotazione e
 * verificare se un o piu' posti sono disponibili.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES2: Registro Studenti
 * 
 * Crea una classe Studente con attributi come nome, matricola, e voti (usa un
 * ArrayList). Aggiungi metodi per aggiungere voti, calcolare la media dei voti,
 * e stampare i dettagli dello studente. Implementa la gestione delle eccezioni
 * per evitare errori nell'inserimento dei voti.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES3: Simulatore di Banca
 * 
 * Definisci una classe ContoBancario con metodi per depositare denaro,
 * prelevare denaro e ottenere il saldo. Assicurati di gestire il caso in cui si
 * tenta di prelevare più denaro di quanto disponibile con un'eccezione.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES4: Elenco Telefonico
 * 
 * Implementa una classe Contatto che rappresenti un contatto telefonico con
 * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che gestisca una
 * lista di contatti. Includi metodi per aggiungere, rimuovere e cercare
 * contatti. Gestisci eventuali eccezioni relative all'inserimento di numeri di
 * telefono non validi.
 * 
 */

 public class App {
    public static void main(String[] args) throws Exception {

        PrenotazioniTest();
        StudenteTest();
    }

    public static void PrenotazioniTest() throws Exception {

        Prenotazione prenotazione = new Prenotazione(10);
        int[] postiDaVerificare = { 2, 5, 6, 7, 8};

        System.out.println("Prenotazione posto 8: " + prenotazione.prenotaPosto(8));
        System.out.println("Prenotazione posto 5: " + prenotazione.prenotaPosto(5));
        System.out.println("Verifica disponibilità posto 5: " + prenotazione.isPostoDisponibile(5));
        System.out.println("Annulla prenotazione posto 5: " + prenotazione.annullaPrenotazione(5));
        System.out.println("Verifica disponibilità posto 5: " + prenotazione.isPostoDisponibile(5));
        System.out.println("Verifica più posti disponibili: " + prenotazione.postiDisponibili(postiDaVerificare));
    }

    public static void StudenteTest(){
        Studente studente = new Studente("Mario", "1234");
        studente.addVoto(9);
        studente.addVoto(7);
        studente.addVoto(5);
        studente.addVoto(11); //stampa errore
        studente.stampaStudente();
    }
}