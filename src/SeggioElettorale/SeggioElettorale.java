package SeggioElettorale;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SeggioElettorale {
    
    private final Map<Candidato, Integer> voti;
    private final Set<Elettore> elettori;


    public SeggioElettorale(){
        voti = new HashMap<>();
        elettori = new HashSet<>();
    }

    public void aggiungiCandidato(Candidato candidato){
        voti.putIfAbsent(candidato, 0);
    }

    public void aggiungiElettore(Elettore elettore){
        elettori.add(elettore);
    }

    public void vota(Elettore elettore, Candidato candidato) throws  Exception{
        if(!elettori.contains(elettore)){
            throw new Exception("L'elettore " + elettore.getName() + " non è registrato");
        }
        if(!voti.containsKey(candidato)){
            throw new Exception("Il candidato " + candidato.getName() + " non esiste");
        }
        elettore.vota();
        voti.put(candidato, voti.get(candidato) +1);
    }

    public void stampaRisultati(){
        for(Map.Entry<Candidato, Integer> entry : voti.entrySet()){
            System.out.println(entry.getKey().getName() + ": " + entry.getValue() + " voti ricevuti");
        }
        
    }


    



}
