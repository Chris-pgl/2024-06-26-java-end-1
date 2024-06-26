package Alberghiero;

abstract class CameraAlberghiero {
    protected int numeroLetti;

    public CameraAlberghiero(int numeroLetti){
        this.numeroLetti = numeroLetti;
    }
    
    public int getNumeroLetti(){
        return  numeroLetti;
    }

    public abstract double calcolaCosto();
    

}
