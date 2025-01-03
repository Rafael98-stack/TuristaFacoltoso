package Repositories;

import Entities.Host;

import java.util.HashMap;
import java.util.Map;

public class HostDAO {
    private static Map<Integer, Host> hosts = new HashMap<>();

    public Host getHost(int codiceHost){
for (Host host : hosts.values()){
    if (codiceHost==host.getCodiceHost()){
        return host;
    }
}
        return null;
    }
    public void addHost(Host host){
        hosts.put(host.getId(), host);
    }
    public void removeHostByCodiceHost(int codiceHost){
hosts.remove(codiceHost);
    }
}
