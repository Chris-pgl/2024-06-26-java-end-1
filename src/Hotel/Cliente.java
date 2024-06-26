package Hotel;
/* 
* Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa per
* associare clienti a prenotazioni e una lista di camere disponibili.
* Implementa metodi per effettuare, modificare e cancellare prenotazioni,
* assicurandoti di gestire eccezioni come camere non disponibili o
* cancellazioni tardive.
*/
public class Cliente {
    private String name;

    public Cliente(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cliente [name=" + name + "]";
    }

    
}
