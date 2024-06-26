package Azienda;

public class Manager extends Impiegato {
    
   private double bonus;

    public Manager(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void aumentaSalario(int percentuale){
        double salarioConBonus = getSalario() + bonus;
        double nuovoSalario = salarioConBonus + salarioConBonus * percentuale / 100.0;
        super.aumentaSalario(percentuale);
        double aumentoCausatoDalBonus = nuovoSalario - (getSalario() + bonus);
        super.aumentaSalario((int) ((aumentoCausatoDalBonus / getSalario()) * 100));
    }

    @Override
    public String toString() {
        return "Manager [bonus=" + bonus + ", Nome=" + getNome() + ", Salario=" + getSalario() + "]";
    }

    
    
}
