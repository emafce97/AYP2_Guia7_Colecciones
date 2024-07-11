package excepciones;

import domain.Proceso;

import java.util.PriorityQueue;
import java.util.Queue;

public class SistemaOperativo {

    private Queue<Proceso> procesos;

    public SistemaOperativo(){
        this.procesos = new PriorityQueue<>();
    }
}
