import java.util.ArrayList;

public class Studente {
/* 
 * ES2: Registro Studenti
 * 
 * Crea una classe Studente con attributi come nome, matricola, e voti (usa un
 * ArrayList). Aggiungi metodi per aggiungere voti, calcolare la media dei voti,
 * e stampare i dettagli dello studente. Implementa la gestione delle eccezioni
 * per evitare errori nell'inserimento dei voti.
 */

    String name;
    String matricola;
    ArrayList<Integer> voti = new ArrayList<Integer>();

    int media = 0;

    public Studente(String name, String matricola) {
        this.name = name;
        this.matricola = matricola;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public ArrayList<Integer> getVoti() {
        return voti;
    }

    public void setVoti(ArrayList<Integer> voti) {
        this.voti = voti;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }
    
    //aggiungi voto
    public void addVoto(int voto) {
        try {
            if(voto < 0 || voto > 10){
                throw new Exception("Voto non valido: " + voto + ", deve essere tra 0 e 10");
            }
            voti.add(voto);
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }


    //calcolo la media
    public double calcolaMedia() {
        if (voti.isEmpty()) {
            return 0.0;
        }
        int somma = 0;
        for (int voto : voti) {
            somma += voto;
        }
        return (double) somma / voti.size();
    }


    //Stampa studente e voti
    public void stampaStudente() {
        System.out.println("Nome: " + getName());
        System.out.println("Matricola: " + getMatricola());
        System.out.println("Voti: " + getVoti());
        System.out.println("Media voti: " + calcolaMedia());
    }

}
