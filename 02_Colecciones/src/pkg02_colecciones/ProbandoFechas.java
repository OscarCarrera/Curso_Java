package pkg02_colecciones;

import java.util.Date;
import java.util.GregorianCalendar;

public class ProbandoFechas {

    public static void probar() {

        GregorianCalendar fecha = new GregorianCalendar();
        fecha.set(2019, 9, 7,0,3,0);
        Date fechaDate = fecha.getTime();
        System.out.print(fechaDate);
        
        GregorianCalendar miCumple;
        miCumple=new GregorianCalendar(2019,9,7,0,3,0);
        System.out.println(miCumple.getTime());
        if (miCumple.after(fecha)){
             System.out.println("Ya cumpliste años");
        }
        else if (miCumple.before(fecha)){
        System.out.println("Aún no es tu cumpleaños");
        }
        else if (miCumple.equals(fecha)){
            System.out.println("Cumpleaños feliz");
        }
    }
}
