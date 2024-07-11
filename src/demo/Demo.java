package demo;

import domain.Proceso;
import excepciones.PrioridadEx;
import excepciones.TiempoEjecucionEx;

public class Demo {

    public static void main(String[] args){
        try{
            Proceso p1 = new Proceso(1.3, 3);
            System.out.println(p1);
        }catch (TiempoEjecucionEx | PrioridadEx e){
            System.err.println(e);
        }
    }


}
