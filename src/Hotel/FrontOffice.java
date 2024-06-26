package Hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrontOffice {
    
    private List<Camera> camereDisponibili;
    private Map<Cliente, List<Prenotazione>> prenotazioni;


    public FrontOffice(){
        camereDisponibili = new ArrayList<>();
        prenotazioni = new HashMap<>();
    }

    public void aggiungiCamera(Camera camera){
        camereDisponibili.add(camera);
    }

    public void aggiungiPrenotazione(Cliente cliente, Camera camera, String dataArrivo, String dataUscita) throws Exception{
        if(!camereDisponibili.contains(camera)){
            throw new Exception("La camera non è disponibile " + camera);
        }
        Prenotazione nuovaPrenotazione = new Prenotazione(camera, cliente, dataArrivo, dataUscita);    
        List<Prenotazione> prenotazioniCliente = prenotazioni.get(cliente);
        if (prenotazioniCliente == null) {
             prenotazioniCliente = new ArrayList<>();
             prenotazioni.put(cliente, prenotazioniCliente);
            }
        prenotazioniCliente.add(nuovaPrenotazione);
    }

    public void modificaPrenotazione(Cliente cliente, Prenotazione prenotazioneEsistente, Camera nuovaCamera, String nuovaDataInizio, String nuovaDataFine) throws Exception{
        List<Prenotazione> prenotazioniCliente = prenotazioni.get(cliente);

        if(prenotazioniCliente == null || !prenotazioniCliente.contains(prenotazioneEsistente)){
            throw new Exception("La prenotazione non esiste");
        }
        if(!camereDisponibili.contains(nuovaCamera)){
            throw new Exception("La camera non è disponibile " + nuovaCamera);
        }
        prenotazioniCliente.remove(prenotazioneEsistente);
        camereDisponibili.add(prenotazioneEsistente.getCamera());

        prenotazioneEsistente.setCamera(nuovaCamera);
        prenotazioneEsistente.setDataArrivo(nuovaDataInizio);
        prenotazioneEsistente.setDataUscita(nuovaDataFine);

        prenotazioniCliente.add(prenotazioneEsistente);
        camereDisponibili.remove(nuovaCamera);
    }

    public void eliminaPrenotazione(Cliente cliente, Prenotazione prenotazioneDaEliminare) throws Exception{
        List<Prenotazione> prenotazioniCliente = prenotazioni.get(cliente);
        if(prenotazioniCliente == null || !prenotazioniCliente.contains(prenotazioneDaEliminare)){
            throw  new Exception("Prenotazione non trobata per il cliente: " + cliente);
        }
        prenotazioniCliente.remove(prenotazioneDaEliminare);
        camereDisponibili.add(prenotazioneDaEliminare.getCamera());
    }

    public void stampaPrenotazioni(){
        for(Map.Entry<Cliente, List<Prenotazione>> entry : prenotazioni.entrySet()){
            Cliente cliente = entry.getKey();
            List<Prenotazione> listaPrenotazioni = entry.getValue();
            System.out.println("Prenotazioni per " + cliente + ":");
            for (Prenotazione prenotazione : listaPrenotazioni) {
                System.out.println(prenotazione);
            }
        }
    }

    public List<Camera> getCamereDisponibili() {
        return camereDisponibili;
    }

    public Map<Cliente, List<Prenotazione>> getPrenotazioni() {
        return prenotazioni;
    }

    public void eliminaPrenotazione(Cliente cliente){
        prenotazioni.remove(cliente);
    }
   
    

}
