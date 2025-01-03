package Payloads.abitazione;

import Entities.Abitazione;
import Entities.User;

import java.time.LocalDateTime;

public record PrenotazioneRegisterDto(LocalDateTime start, LocalDateTime end, Abitazione abitazione, User user) {
}
