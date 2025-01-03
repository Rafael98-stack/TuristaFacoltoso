package Servivies;

import Entities.Host;
import Payloads.abitazione.HostRegisterDto;
import Repositories.HostDAO;

public class HostService {
HostDAO hostDAO = new HostDAO();

public Host getHost(int codiceHost){
    return hostDAO.getHost(codiceHost);
}

public String getInfoHost(int codiceHost){
    Host host = hostDAO.getHost(codiceHost);
    return host.toString();
}
public void addHost(HostRegisterDto hostRegisterDto){
    Host host = new Host(hostRegisterDto.nome(), hostRegisterDto.cognome(), hostRegisterDto.email(), hostRegisterDto.indirizzo());
    hostDAO.addHost(host);
    System.out.println("Aggiunta dell'Host effetuata correttamente.");
}

public void removeByCodiceHost(int codiceHost){
    hostDAO.removeHostByCodiceHost(codiceHost);
    System.out.println("Rimozione effetuata con successo.");
}
}
