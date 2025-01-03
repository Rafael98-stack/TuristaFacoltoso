package Entities;

public class Abitazione {
private static int idTot = 0;
    private Integer id;
    private String nome,indirizzo;
    private int locali,letti,piano;

    public Abitazione(String nome, String indirizzo, int locali, int letti, int piano) {
        this.id=++idTot;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.locali = locali;
        this.letti = letti;
        this.piano = piano;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getLocali() {
        return locali;
    }

    public void setLocali(int locali) {
        this.locali = locali;
    }

    public int getLetti() {
        return letti;
    }

    public void setLetti(int letti) {
        this.letti = letti;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    @Override
    public String toString() {
        return "Abitazione{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", locali=" + locali +
                ", letti=" + letti +
                ", piano=" + piano +
                '}';
    }
}
