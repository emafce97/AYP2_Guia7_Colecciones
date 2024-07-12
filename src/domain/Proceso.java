package domain;

import excepciones.*;

import java.time.LocalDateTime;

public class Proceso implements Comparable<Proceso> {
    private int tiempoArribo;
    private int tiempoEjecucion;
    private int prioridad;

    /**
     * @param tiempoEjecucion en segundos
     * @param prioridad       entre 1 y 5
     * @throws TiempoEjecucionEx
     * @throws PrioridadEx
     */
    public Proceso(int tiempoArribo, int tiempoEjecucion, int prioridad) throws TiempoArriboEx, TiempoEjecucionEx, PrioridadEx {
        if (tiempoEjecucion < 0) {
            throw new TiempoEjecucionEx();
        } else if (prioridad < 0 || prioridad > 5) {
            throw new PrioridadEx();
        }
        this.tiempoEjecucion = tiempoEjecucion;
        this.prioridad = prioridad;
        this.tiempoArribo = tiempoArribo;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    private int getTiempoArribo() {
        return this.tiempoArribo;
    }

    public String toString() {
        return STR."Tiempo ejecucion: \{this.tiempoEjecucion} - Prioridad: \{this.prioridad} - Tiempo de arribo: \{this.tiempoArribo}";
    }

    public void ejecutar() {
        System.out.println(STR."Ejecutando proceso con prioridad \{this.prioridad} con tiempo de arrivo \{this.tiempoArribo}");
    }

    @Override
    public int compareTo(Proceso o) {
        if (this.prioridad > o.getPrioridad()) {
            return 1;
        } else if (this.prioridad < o.getPrioridad()) {
            return -1;
        }
        return Integer.compare(this.tiempoArribo, o.getTiempoArribo());
    }


}
