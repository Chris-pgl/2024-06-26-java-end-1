
import java.util.ArrayList;
import java.util.List;

public class Contatto {

    /* 
 * Implementa una classe Contatto che rappresenti un contatto telefonico con
 * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che gestisca una
 * lista di contatti. Includi metodi per aggiungere, rimuovere e cercare
 * contatti. Gestisci eventuali eccezioni relative all'inserimento di numeri di
 * telefono non validi.
     */

    //Ho creato la classe ElencoTelefonico sotto la classe Contatto
    private String nome;
    private String numeroTelefono;

    /*
    public Contatto(String nome, String numeroTelefono) throws Exception {
        this.nome = nome;
        if(isValidNum(numeroTelefono)){
            this.numeroTelefono = numeroTelefono;
        }else{
            throw new Exception("Numero di telefono non valido");
        }
    }
    */

    

    public String getNome() {
        return nome;
    }

    public Contatto(String nome, String numeroTelefono) throws Exception {
        if(isValidNum(numeroTelefono)){
        this.nome = nome;
        this.numeroTelefono = numeroTelefono;
        }else{
           throw new Exception("Numero di telefono non valido");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    //validare il numero
    private boolean isValidNum(String numeroTelefono) {
        //deve essere diverso da null e contenere 10 cifre
        return  numeroTelefono.matches("\\d{10}");
    }

    @Override
    public String toString() {
        return "Contatto [nome=" + nome + ", numeroTelefono=" + numeroTelefono + "]";
    }
}

class ElencoTelefonico {

    private List<Contatto> contatti;

  
    public ElencoTelefonico() {
        contatti = new ArrayList<>();
    }

    //aggiungi contatto
    public void addContatto(Contatto contatto) {
        contatti.add(contatto);
    }

    //rimuovi contatto
    public void removeContatto(String nome) {
        for (Contatto c : contatti) {
            if (c.getNome().toLowerCase().equals(nome)) {
                contatti.remove(c);
                break;
            }
        }
    }

    //cerca contatto
    public Contatto cercaContatto(String nome) {
        for (Contatto c : contatti) {
            if (c.getNome().toLowerCase().equals(nome)) {
                return c;
            }
        }
        return null;
    }

    //stampa rubrica
    public void stampaRubrica() {
        for (Contatto c : contatti) {
            System.out.println(c);
        }
    }

    
}
