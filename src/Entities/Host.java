package Entities;

public class Host extends Utente{
private static int  idTot = 0;
private int id;

    public Host(String nome, String cognome, String email, String indirizzo) {
        super(nome, cognome, email, indirizzo);
        this.id=++idTot;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Host{" +
                "id='" + getNome() + '\'' +
                "nome='" + super.getNome() + '\'' +
                ", cognome='" + super.getCognome() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", indirizzo='" + super.getIndirizzo() + '\'' +
                '}';
    }
}
