/**
 * Representa una reserva para una pista deportiva.
 * Contiene información sobre la pista, la fecha y la duración de la reserva.
 * 
 * @author Diego
 */
import java.time.LocalDate;

public class Reserva {
    private int idPista;
    private LocalDate fecha;
    private int duracion;

    /**
     * Crea una nueva reserva.
     * 
     * @param idPista ID de la pista a reservar.
     * @param fecha Fecha de la reserva.
     * @param duracion Duración en horas de la reserva.
     */
    public Reserva(int idPista, LocalDate fecha, int duracion) {
        this.idPista = idPista;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    /**
     * Obtiene el ID de la pista.
     * 
     * @return ID de la pista.
     */
    public int getIdPista() {
        return idPista;
    }

    /**
     * Obtiene la fecha de la reserva.
     * 
     * @return Fecha como LocalDate.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Obtiene la duración de la reserva.
     * 
     * @return Duración en horas.
     */
    public int getDuracion() {
        return duracion;
    }
}
