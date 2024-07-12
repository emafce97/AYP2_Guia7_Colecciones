package excepciones;

import domain.Proceso;
import java.util.PriorityQueue;
import java.util.Queue;

public class SistemaOperativo {

    private Queue<Proceso> procesos;

    public SistemaOperativo(){
        this.procesos = new PriorityQueue<>();
    }

    public void agregar(Proceso... procesos){
        for(Proceso p : procesos){
            this.procesos.add(p);
        }
    }

    public void ejecutarProcesos(){
        while(!this.procesos.isEmpty()){
            this.procesos.poll().ejecutar();
        }
    }
}
