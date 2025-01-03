package Repositories;

import Entities.Prenotazione;

import java.util.HashMap;
import java.util.Map;

public class PrenotazioneDAO {
    private static Map<Integer, Prenotazione> prenotazioni = new HashMap<>();

    public Prenotazione getPrenotazione(int id){
        for (Prenotazione prenotazione : prenotazioni.values()){
            if (id== prenotazione.getId()){
                return prenotazione;
            }
        }
        return null;
    }
    public void addPrenotazione(Prenotazione prenotazione){
        prenotazioni.put(prenotazione.getId(), prenotazione);
    }
    public void removeById(int id){
        prenotazioni.remove(id);
    }

    public Prenotazione getLastPrenotazioneByUtente(int id){
        Prenotazione risultato = null;
        for (Prenotazione prenotazione : prenotazioni.values()){
            if (prenotazione.getUser().getId() == id && prenotazione.getStart().isAfter(risultato.getStart())) {
                risultato = prenotazione;
            }
        }
        return risultato;
    }
}
