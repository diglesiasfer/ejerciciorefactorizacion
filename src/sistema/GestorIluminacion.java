/**
 * Clase encargada de gestionar la iluminación de las pistas deportivas.
 * Se encarga de encender y apagar luces según el ID de pista.
 * 
 * @author Diego
 */
public class GestorIluminacion {

    private boolean[] iluminacion;

    /**
     * Crea un nuevo gestor de iluminación para un número de pistas.
     * 
     * @param numeroDePistas Número total de pistas.
     */
    public GestorIluminacion(int numeroDePistas) {
        iluminacion = new boolean[numeroDePistas];
    }

    /**
     * Enciende la iluminación de una pista específica.
     * 
     * @param idPista ID de la pista.
     */
    public void encenderLuces(int idPista) {
        if (idPista >= 0 && idPista < iluminacion.length) {
            iluminacion[idPista] = true;
        }
    }

    /**
     * Apaga la iluminación de una pista específica.
     * 
     * @param idPista ID de la pista.
     */
    public void apagarLuces(int idPista) {
        if (idPista >= 0 && idPista < iluminacion.length) {
            iluminacion[idPista] = false;
        }
    }

    /**
     * Verifica si las luces están encendidas para una pista.
     * 
     * @param idPista ID de la pista.
     * @return true si está encendida, false si está apagada.
     */
    public boolean estaEncendida(int idPista) {
        if (idPista >= 0 && idPista < iluminacion.length) {
            return iluminacion[idPista];
        }
        return false;
    }
}
