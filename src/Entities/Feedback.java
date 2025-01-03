package Entities;

public class Feedback {

    private Integer id;
    private static Integer idTot = 0;
    private String titolo;
    private String testo;
    private Integer punteggio;

    public Feedback(String titolo, String testo, Integer punteggio) {
        this.id = ++idTot;
        this.titolo = titolo;
        this.testo = testo;
        if (punteggio < 1 || punteggio > 5) throw new IllegalArgumentException("Il punteggio deve essere tra 0 e 5 stelle");
        this.punteggio = punteggio;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getTesto() {
        return testo;
    }
    public void setTesto(String testo) {
        this.testo = testo;
    }
    public Integer getPunteggio() {
        return punteggio;
    }
    public void setPunteggio(Integer punteggio) {
        this.punteggio = punteggio;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", testo='" + testo + '\'' +
                ", punteggio=" + punteggio +
                '}';
    }
}
