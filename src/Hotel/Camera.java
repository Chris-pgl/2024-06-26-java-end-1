package Hotel;

/* 
* Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa per
* associare clienti a prenotazioni e una lista di camere disponibili.
* Implementa metodi per effettuare, modificare e cancellare prenotazioni,
* assicurandoti di gestire eccezioni come camere non disponibili o
* cancellazioni tardive.
*/
public class Camera {
    private int numeroCamere;

    public int getNumeroCamere() {
        return numeroCamere;
    }

    public void setNumeroCamere(int numeroCamere) {
        this.numeroCamere = numeroCamere;
    }

    public Camera(int numeroCamere) {
        this.numeroCamere = numeroCamere;
    }

    @Override
    public String toString() {
        return "Camera [numeroCamere=" + numeroCamere + "]";
    }

   
}
