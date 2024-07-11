package domain;

import excepciones.*;
import java.time.LocalDateTime;

public class Proceso {
    private int tiempoArribo;
    private double tiempoEjecucion;
    private int prioridad;

    /**
     *
     * @param tiempoEjecucion en segundos
     * @param prioridad entre 1 y 5
     * @throws TiempoEjecucionEx
     * @throws PrioridadEx
     */
    public Proceso(double tiempoEjecucion, int prioridad) throws TiempoEjecucionEx, PrioridadEx {
        if(tiempoEjecucion < 0){
            throw new TiempoEjecucionEx();
        }else if(prioridad < 0 || prioridad > 5){
            throw new PrioridadEx();
        }
        this.tiempoEjecucion = tiempoEjecucion;
        this.prioridad = prioridad;
        this.tiempoArribo = LocalDateTime.now().getMinute();
    }

    public String toString(){
        return String.format("Tiempo ejecucion: %s - Prioridad: %d - Tiempo de arribo: %d", this.tiempoEjecucion, this.prioridad, this.tiempoArribo);
    }
}
