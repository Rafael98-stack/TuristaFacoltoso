package Servivies;

import Entities.Prenotazione;
import Payloads.abitazione.PrenotazioneRegisterDto;
import Repositories.PrenotazioneDAO;

public class PrenotazioneService {

    PrenotazioneDAO prenotazioneDAO = new PrenotazioneDAO();

    public Prenotazione getPrenotazione(int idPrenotazione){return prenotazioneDAO.getPrenotazione(idPrenotazione);}

    public String getInfoPrenotazione(int idPrenotazione){
        Prenotazione prenotazione = prenotazioneDAO.getPrenotazione(idPrenotazione);
        return prenotazione.toString();
    }

    public void addPrenotazione(PrenotazioneRegisterDto prenotazioneRegisterDto){
        Prenotazione prenotazione = new Prenotazione(prenotazioneRegisterDto.start(),prenotazioneRegisterDto.end(),prenotazioneRegisterDto.abitazione(),prenotazioneRegisterDto.user());
        prenotazioneDAO.addPrenotazione(prenotazione);
        System.out.println("Aggiunta della prenotazione effettuata correttamente");
    }

    public void removePrenotazioneById(int id){
        prenotazioneDAO.removeById(id);
        System.out.println("Rimozione effettuata.");
    }

    public void getLastPrenotazioneByUser(int id){
        prenotazioneDAO.getLastPrenotazioneByUtente(id);
        System.out.println("L'ultima prenotazione di " + prenotazioneDAO.getLastPrenotazioneByUtente(id).getUser() + " è " + prenotazioneDAO.getLastPrenotazioneByUtente(id));
    }
}
