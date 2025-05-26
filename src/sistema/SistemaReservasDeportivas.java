/**
 * Sistema de gestión de reservas deportivas.
 * Permite realizar reservas, cancelarlas y controlar la iluminación de las pistas.
 * 
 * Se asume un máximo de 10 pistas.
 * 
 * @author Diego
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaReservasDeportivas {

    private List<Reserva> reservas;
    private GestorIluminacion gestorIluminacion;
    private static final int MAX_PISTAS = 10;

    public SistemaReservasDeportivas() {
        reservas = new ArrayList<>();
        gestorIluminacion = new GestorIluminacion(MAX_PISTAS);
    }

    /**
     * Realiza una reserva de pista si está disponible.
     * 
     * @param reserva Objeto de tipo Reserva.
     * @return true si se realizó la reserva, false si no está disponible.
     */
    public boolean reservarPista(Reserva reserva) {
        if (reserva.getIdPista() < 0 || reserva.getIdPista() >= MAX_PISTAS) {
            return false;
        }
        if (!esFechaDisponible(reserva)) {
            return false;
        }
        reservas.add(reserva);
        return true;
    }

    /**
     * Cancela una reserva dado su índice.
     * 
     * @param idReserva Índice de la reserva en la lista.
     * @return true si fue cancelada, false si no se encontró.
     */
    public boolean cancelarReserva(int idReserva) {
        if (idReserva >= 0 && idReserva < reservas.size()) {
            reservas.remove(idReserva);
            return true;
        }
        return false;
    }

    /**
     * Método privado que verifica si una reserva tiene fecha disponible.
     * 
     * @param nuevaReserva Reserva a comprobar.
     * @return true si la fecha está libre, false si ya hay una reserva en esa fecha para la misma pista.
     */
    private boolean esFechaDisponible(Reserva nuevaReserva) {
        for (Reserva r : reservas) {
            if (r.getIdPista() == nuevaReserva.getIdPista() && r.getFecha().equals(nuevaReserva.getFecha())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Enciende las luces de una pista.
     * 
     * @param idPista ID de la pista.
     */
    public void encenderLuces(int idPista) {
        gestorIluminacion.encenderLuces(idPista);
    }

    /**
     * Apaga las luces de una pista.
     * 
     * @param idPista ID de la pista.
     */
    public void apagarLuces(int idPista) {
        gestorIluminacion.apagarLuces(idPista);
    }
}
