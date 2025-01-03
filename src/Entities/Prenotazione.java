package Entities;

import java.time.LocalDateTime;

public class Prenotazione {
    private static int idTot = 0;

    private Integer id;

    private LocalDateTime start;
    private LocalDateTime end;
    private Abitazione abitazione;
    private User user;

    public Prenotazione(LocalDateTime start, LocalDateTime end, Abitazione abitazione, User user) {
        this.id = ++idTot;
        this.start = start;
        this.end = end;
        this.abitazione = abitazione;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public Abitazione getAbitazione() {
        return abitazione;
    }

    public void setAbitazione(Abitazione abitazione) {
        this.abitazione = abitazione;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
