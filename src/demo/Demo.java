package demo;

import domain.Proceso;
import excepciones.*;

public class Demo {

    public static void main(String[] args){
        try{
            Proceso p1 = new Proceso(0,5, 4);
            Proceso p2 = new Proceso(1,3, 2);
            Proceso p3 = new Proceso(2,8, 5);
            Proceso p4 = new Proceso(3,2, 4);
            Proceso p5 = new Proceso(4,3, 2);
            SistemaOperativo so = new SistemaOperativo();
            so.agregar(p1, p2, p3, p4, p5);
            so.ejecutarProcesos();
        }catch (TiempoEjecucionEx | PrioridadEx | TiempoArriboEx e){
            System.err.println(e);
        }
    }


}
