package Alberghiero;

import java.util.ArrayList;
import java.util.List;

public class Albergo {

    private List<CameraAlberghiero> camereDisponibili;

    public Albergo(){
        camereDisponibili = new ArrayList<>();
    }

    public void aggiungiCamera(CameraAlberghiero camera) {
        camereDisponibili.add(camera);
    }

    public void mostraCamere() {
        for (CameraAlberghiero camera : camereDisponibili) {
            System.out.println(camera);
        }
    
    }
}
