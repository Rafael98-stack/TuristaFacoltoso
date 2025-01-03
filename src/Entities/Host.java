package Entities;

public class Host extends Persona {
    private static int  codiceHostTot = 0;
    private Integer codiceHost;
    private Boolean isSuperHost = false;


    public Host(String nome, String cognome, String email, String indirizzo) {
        super(nome, cognome, email, indirizzo);
        this.codiceHost = codiceHostTot++;
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

    @Override
    public String toString() {
        return "Host{" +
                "codiceHost=" + codiceHost +
                ", isSuperHost=" + isSuperHost +
                "} " + super.toString();
    }
}
