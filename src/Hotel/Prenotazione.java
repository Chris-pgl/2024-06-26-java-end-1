package Hotel;
/* 
* Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa per
* associare clienti a prenotazioni e una lista di camere disponibili.
* Implementa metodi per effettuare, modificare e cancellare prenotazioni,
* assicurandoti di gestire eccezioni come camere non disponibili o
* cancellazioni tardive.
*/
public class Prenotazione {
    
    private Camera camera;
    private Cliente cliente;

    private String dataArrivo;
    private String  dataUscita;

    public Prenotazione(Camera camera, Cliente cliente, String dataArrivo, String dataUscita){
        this.camera = camera;
        this.cliente = cliente;
        this.dataArrivo = dataArrivo;
        this.dataUscita = dataUscita;
    }


    public Camera getCamera() {
        return camera;
    }


    public void setCamera(Camera camera) {
        this.camera = camera;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public String getDataArrivo() {
        return dataArrivo;
    }


    public void setDataArrivo(String dataArrivo) {
        this.dataArrivo = dataArrivo;
    }


    public String getDataUscita() {
        return dataUscita;
    }


    public void setDataUscita(String dataUscita) {
        this.dataUscita = dataUscita;
    }


    @Override
    public String toString() {
        return "Prenotazione [camera=" + camera + ", cliente=" + cliente + ", dataArrivo=" + dataArrivo
                + ", dataUscita=" + dataUscita + "]";
    }

    

}
