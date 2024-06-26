package Alberghiero;

public class CameraDoppia extends CameraAlberghiero{
    
    public CameraDoppia() {
        super(2);
    }

    @Override
    public double calcolaCosto() {
        return 75.0;
    }

    @Override
    public String toString() {
        return "CameraDoppia{" +
                "numeroLetti=" + numeroLetti +
                ", costo=" + calcolaCosto() +
                '}';
    }

}
