import Alberghiero.Albergo;
import Alberghiero.CameraDoppia;
import Alberghiero.CameraSingola;
import Alberghiero.CameraSuites;
import Azienda.Impiegato;
import Azienda.Manager;
import Hotel.Camera;
import Hotel.Cliente;
import Hotel.FrontOffice;
import SeggioElettorale.Candidato;
import SeggioElettorale.Elettore;
import SeggioElettorale.SeggioElettorale;

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
 * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che
 * gestisca una
 * lista di contatti. Includi metodi per aggiungere, rimuovere e cercare
 * contatti. Gestisci eventuali eccezioni relative all'inserimento di numeri di
 * telefono non validi.
 * 
 * /*
 *
 * ES5: Sistema di Votazione
 * 
 * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
 * Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
 * ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
 * doppi voti o voti a candidati non esistenti.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES6: Sistema di Prenotazione Hotel
 * 
 * Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa per
 * associare clienti a prenotazioni e una lista di camere disponibili.
 * Implementa metodi per effettuare, modificare e cancellare prenotazioni,
 * assicurandoti di gestire eccezioni come camere non disponibili o
 * cancellazioni tardive.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES7: Impiegato e Manager
 * 
 * Crea una classe Impiegato con attributi come nome, salario e metodi per
 * aumentaSalario(int percentuale). Deriva da questa una classe Manager che
 * aggiunge l'attributo bonus. Il metodo aumentaSalario del manager dovrebbe
 * considerare anche il bonus nell'aumento. Mostra come puoi utilizzare il
 * polimorfismo per gestire diversi tipi di impiegati in un array di tipo
 * Impiegato.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES8: Sistema di Prenotazione Alberghiera
 * 
 * Progetta una classe astratta CameraAlbergo con metodi come calcolaCosto() e
 * numeroLetti(). Deriva da questa diverse classi specifiche come CameraSingola,
 * CameraDoppia e Suite. Implementa calcolaCosto in modo diverso per ogni tipo
 * di camera. Utilizza una collezione per gestire tutte le camere disponibili in
 * un albergo.
 * 
 */


public class App {
    public static void main(String[] args) throws Exception {

        PrenotazioniTest();
        StudenteTest();
        ContoBancarioTest();
        ElencoTelefonicoTest();
        SeggioElettoraleTest();
        HotelTest();
        AziendaTest();
        AlbergoTest();
    }

    public static void PrenotazioniTest() throws Exception {

        Prenotazione prenotazione = new Prenotazione(10);
        int[] postiDaVerificare = { 2, 5, 6, 7, 8 };
        System.out.println("------- Prenotazioni ---------");
        System.out.println("Verifica più posti disponibili: " + prenotazione.postiDisponibili(postiDaVerificare));
        System.out.println("Prenotazione posto 8: " + prenotazione.prenotaPosto(8));
        System.out.println("Prenotazione posto 5: " + prenotazione.prenotaPosto(5));
        System.out.println("Verifica disponibilità posto 5: " + prenotazione.isPostoDisponibile(5));
        System.out.println("Verifica disponibilità posto 8: " + prenotazione.isPostoDisponibile(8));
        System.out.println("Annulla prenotazione posto 5: " + prenotazione.annullaPrenotazione(5));
        System.out.println("Verifica disponibilità posto 5: " + prenotazione.isPostoDisponibile(5));
        System.out.println("Verifica più posti disponibili: " + prenotazione.postiDisponibili(postiDaVerificare));
    }

    public static void StudenteTest() throws Exception {
        Studente studente = new Studente("Mario", "1234");
        System.out.println("----- Studente ------");
        System.out.println("Nome: " + studente.getName());
        System.out.println("Voti:");
        studente.addVoto(9);
        studente.addVoto(7);
        studente.addVoto(5);
        studente.addVoto(11); // stampa errore
        studente.stampaStudente();
    }

    public static void ContoBancarioTest() throws Exception {
       
System.out.println("----- Conto Bancario ------");
        ContoBancario contoBancario = new ContoBancario(1000);
        System.out.println("Aperto un nuovo conto! saldo: " + contoBancario.getSaldo());
        contoBancario.deposita(100);
        System.out.println("Saldo dopo il deposito 100: " + contoBancario.getSaldo());
        contoBancario.preleva(1000);
        System.out.println("Prelevo 1000, saldo restante: " + contoBancario.getSaldo());
        try {
            contoBancario.preleva(200);
        } catch (Exception e) {
            System.err.println("Errore durante il prelievo");
        }
    }

    public static void ElencoTelefonicoTest() throws Exception {

       
        System.out.println("----- Elenco Telefonico ------");
        try {

            ElencoTelefonico elenco = new ElencoTelefonico();
            Contatto contattoG = new Contatto("Gino Lino", "1234567890");
            Contatto contattoE = new Contatto("Elen", "2345781249");
            Contatto contattoM = new Contatto("Mario", "1246890348");

            elenco.addContatto(contattoG);
            elenco.addContatto(contattoE);
            elenco.addContatto(contattoM);

            System.out.println("Contatti: ");
            elenco.stampaRubrica();

            Contatto cerca = elenco.cercaContatto("Mario");
            Contatto cercaf = elenco.cercaContatto("Luigi");
            System.out.println("Contatto cercato: " + cerca);
            System.out.println("Contatto cercato: " + cercaf);

            System.out.println("Rimozione dall'elento Mario");
            elenco.removeContatto("Mario");
            elenco.stampaRubrica();
            System.out.println("Prova aggiunta contatto fasullo: ");
            System.out.println("Aggiunta contatto VattelaPesca: " + new Contatto("vattelaPesca", "12345f5"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Pomeriggio 

 public static void SeggioElettoraleTest(){
    SeggioElettorale seggio = new SeggioElettorale();
   
    System.out.println("----- Seggio Elettorale ------");
    
    Candidato candidato1 = new Candidato("Uffugo");
    Candidato candidato2 = new Candidato("Faragalli");

    seggio.aggiungiCandidato(candidato1);
    seggio.aggiungiCandidato(candidato2);

    Elettore elettore1 = new Elettore("Gino");
    Elettore elettore2 = new Elettore("Peppino");

    seggio.aggiungiElettore(elettore1);
    seggio.aggiungiElettore(elettore2);

    try {
        seggio.vota(elettore1, candidato1);
        seggio.vota(elettore2, candidato2);
        seggio.vota(elettore2, candidato2);
    } catch (Exception e) {
        e.getStackTrace();
    }

    seggio.stampaRisultati();
 }  

 public static void HotelTest(){
    System.out.println("----- Hotel ------");

    FrontOffice hotel = new FrontOffice();

    Camera camera = new Camera(1, "Singola");
    Camera camera1 = new Camera(2, "Doppia");
    Camera camera2 = new Camera(3, "Suite");

    hotel.aggiungiCamera(camera);
    hotel.aggiungiCamera(camera1);
    hotel.aggiungiCamera(camera2);

    Cliente cliente1 = new Cliente("Gino");
    Cliente cliente2 = new Cliente("Luca");

    try {
        hotel.aggiungiPrenotazione(cliente1, camera, "2024-03-20", "2024-03-25");
        hotel.aggiungiPrenotazione(cliente2, camera1, "2024-03-22", "2024-03-28");
        System.out.println("Stampa tutte le prenotazioni:");
        hotel.stampaPrenotazioni();
        hotel.eliminaPrenotazione(cliente2);
        System.out.println("Rimossa prenotazione a: " + cliente2.toString());
        System.out.println("Stampa tutte le prenotazioni:");
        hotel.stampaPrenotazioni();

    } catch (Exception e) {
        e.getStackTrace();
    }




 }

 public static void AziendaTest(){

    System.out.println("----- Azienda ------");

    Impiegato[] impiegati = new Impiegato[3];
    impiegati[0] = new Impiegato("Salvo", 30000);
    impiegati[1] = new Impiegato("Gino", 25000);
    impiegati[2] = new Manager("Peppe", 40000, 5000);

    try {
        for (Impiegato impiegato : impiegati) {
            impiegato.aumentaSalario(10);
        }

        for (Impiegato impiegato : impiegati) {
            System.out.println(impiegato);
        }
    }catch (Exception e) {
        e.getStackTrace();
    }
  }

public static void AlbergoTest(){
    System.out.println("----- Albergo ------");
    Albergo albero = new Albergo();

    albero.aggiungiCamera(new CameraSingola(1));
    albero.aggiungiCamera(new CameraDoppia());
    albero.aggiungiCamera(new CameraSuites(false));
    albero.aggiungiCamera(new CameraSuites(true));
    albero.mostraCamere();
    

}
}
