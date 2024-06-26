package Alberghiero;

public class CameraSuites extends CameraAlberghiero{

    boolean includeJacuzzi;
    
    public CameraSuites(boolean includeJacuzzi) {
        super(2); // una suite ha almeno due letti
        this.includeJacuzzi = includeJacuzzi;
    }


    @Override
    public double calcolaCosto() {
        double costoBase = 150.0; 
        if (includeJacuzzi) {
            costoBase += 50.0;
        }
        return costoBase;
    }

    @Override
    public String toString() {
        return "Suite{" +
                "numeroLetti=" + numeroLetti +
                ", includeJacuzzi=" + includeJacuzzi +
                ", costo=" + calcolaCosto() +
                '}';
    }



}

