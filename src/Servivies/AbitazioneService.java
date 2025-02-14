package Servivies;

import Entities.Abitazione;
import Payloads.abitazione.AbitazioneRegisterDto;
import Repositories.AbitazioneDAO;

public class AbitazioneService {
    AbitazioneDAO abitazioneDAO = new AbitazioneDAO();
    public void addAbitazioneServ(AbitazioneRegisterDto abitazioneRegisterDto){
        Abitazione abitazione = new Abitazione(abitazioneRegisterDto.nome(), abitazioneRegisterDto.indirizzo() , abitazioneRegisterDto.locali(), abitazioneRegisterDto.letti(), abitazioneRegisterDto.piano());
        abitazioneDAO.addAbitazione(abitazione);
    }
}
