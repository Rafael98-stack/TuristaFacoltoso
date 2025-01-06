package Servivies;

import Entities.Abitazione;
import Payloads.abitazione.AbitazioneRegisterDto;
import Repositories.AbitazioneDAO;

public class AbitazioneService {
    AbitazioneDAO abitazioneDAO = new AbitazioneDAO();
    public void addAbitazioneServ(AbitazioneRegisterDto abitazioneRegisterDto){
        Abitazione abitazione = new Abitazione(abitazioneRegisterDto.nome(), abitazioneRegisterDto.indirizzo() , abitazioneRegisterDto.locali(), abitazioneRegisterDto.letti(), abitazioneRegisterDto.piano());
        abitazioneDAO.addAbitazione(abitazione);
        System.out.println("Aggiunto correttamente");
    }

    public void removeAbitazioneById(int id){
abitazioneDAO.removeAbitazioneById(id);
        System.out.println("Rimozione effettuata.");
    }

    public void mediaPostiLetto(){
        System.out.println("La media dei posti letto di tutte le abitazioni è " + abitazioneDAO.mediaPostiLetto());
    }

    // Ritorna un oggetto abitazione
    public Abitazione getAbitazioneById(int id){
        return abitazioneDAO.getAbitazione(id);
    }

    // Ritorna una stringa di informazioni
    public String getAbitazioneInfoById(int id){
        return abitazioneDAO.getInfoAbitazione(id);
    }
}
