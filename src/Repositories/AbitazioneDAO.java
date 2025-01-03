package Repositories;

import Entities.Abitazione;

import java.util.HashMap;
import java.util.Map;

public class AbitazioneDAO {
   private static Map<Integer, Abitazione> abitazioni = new HashMap<>();

   // Metodo per ritornare le informazioni (TRAMITE STRINGA) di una abitazione.
   public String getInfoAbitazione (int id){
       for (Abitazione abitazione: abitazioni.values()){
           if (abitazione.getId() == id){
               return abitazione.toString();
           }
       }
       return null;
   }
   // Metodo che ritorna una abitazione effettiva.
   public Abitazione getAbitazione(int id){
       for (Abitazione abitazione: abitazioni.values()){
           if (abitazione.getId()== id){
               return abitazione;
           }
       }
       return null;
   }
   public void addAbitazione(Abitazione abitazione){
       abitazioni.put(abitazione.getId(),abitazione);
   }

   // Metodo per rimuovere una Abitazione dal "Database".
   public void removeAbitazioneById(int id){
       abitazioni.remove(id);
   }
}
