package Entities;

public class User extends Persona {
    public User(String nome, String cognome, String email, String indirizzo) {
        super(nome, cognome, email, indirizzo);
    }

    @Override
    public String toString() {
        return "User{ " + super.toString()
                + "}";
    }
}
