package Alberghiero;

public class CameraSingola extends CameraAlberghiero {

    public CameraSingola(int numeroLetti) {
        super(1);
       
    }

    @Override
    public double calcolaCosto() {
       return 50.0;
    }

    @Override
    public String toString() {
        return "CameraSingola{" +
                "numeroLetti=" + numeroLetti +
                ", costo=" + calcolaCosto() +
                '}';
    }


    
    
    
}
