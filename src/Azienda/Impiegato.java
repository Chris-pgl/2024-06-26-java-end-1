package Azienda;
/* 
* Crea una classe Impiegato con attributi come nome, salario e metodi per
* aumentaSalario(int percentuale). Deriva da questa una classe Manager che
* aggiunge l'attributo bonus. Il metodo aumentaSalario del manager dovrebbe
* considerare anche il bonus nell'aumento. Mostra come puoi utilizzare il
* polimorfismo per gestire diversi tipi di impiegati in un array di tipo
* Impiegato.
*/ 
public class Impiegato {
   
    private String nome;
    private double salario;

    public Impiegato(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentaSalario(int percentuale) {
        salario += salario * percentuale / 100.0;
    }

    @Override
    public String toString() {
        return "Impiegato{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}


