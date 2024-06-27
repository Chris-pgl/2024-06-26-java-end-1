public class ContoBancario {
 /* 
 * ES3: Simulatore di Banca
 * 
 * Definisci una classe ContoBancario con metodi per depositare denaro,
 * prelevare denaro e ottenere il saldo. Assicurati di gestire il caso in cui si
 * tenta di prelevare più denaro di quanto disponibile con un'eccezione.
 */ 

    private double saldo;

    public ContoBancario(double SaldoIniziale){
        if(SaldoIniziale < 0){
            throw new IllegalArgumentException("Saldo iniziale non può essere negativo");
        }
        this.saldo = SaldoIniziale; 
        
    }


    
    public void deposita(double importo){
        if(importo < 0){
            throw new IllegalArgumentException("Importo non può essere negativo");
            }
            this.saldo += importo;
    }

    
    public void preleva(double importo) throws Exception{
        if(importo < 0){
            throw new IllegalArgumentException("Importo non può essere negativo");
        }
        if(importo > saldo){
            throw new IllegalArgumentException("Non ci sono abbastanza soldi");
            }
            this.saldo -= importo;
    }

    
    
    public double getSaldo(){
        return saldo;
    }
}


