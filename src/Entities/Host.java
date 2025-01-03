package Entities;

public class Host extends Persona {
    private Integer codiceHost;
    private Boolean isSuperHost;

    public Host(int id, String nome, String cognome, String email, String indirizzo, Integer codiceHost, Boolean isSuperHost) {
        super(id, nome, cognome, email, indirizzo);
        this.codiceHost = codiceHost;
        this.isSuperHost = isSuperHost;
    }

    public Boolean getSuperHost() {
        return isSuperHost;
    }

    public void setSuperHost(Boolean isSuperHost) {
        this.isSuperHost = isSuperHost;
    }

    public Integer getCodiceHost() {
        return codiceHost;
    }

    public void setCodiceHost(Integer codiceHost) {
        this.codiceHost = codiceHost;
    }
}
