package pkg02_colecciones;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static pkg02_colecciones.ProbandoFechas.probar;

public class Main {

    public static void main(String[] args) {
        ejemploHashMap();
       probar();
        
        
    }

    static void ejemploHashMap() {
        HashMap<String, Cliente> diccionarioClientes;
        diccionarioClientes = new HashMap<String, Cliente>();

        Cliente c1 = new Cliente(1, "Pepe", Date.valueOf("1983-04-02"), "email", 'm');
        Cliente c2 = new Cliente(2, "Manuela", Date.valueOf("1990-02-05"), "email", 'f');
        Cliente c3 = new Cliente(3, "Sam", Date.valueOf("1978-11-12"), "email", 'n');
        
        diccionarioClientes.put("cliente 1", c1);
        diccionarioClientes.put("cliente 2", c2);
        diccionarioClientes.put("cliente 3", c3);
        
        System.out.println(diccionarioClientes.get("cliente 3").getNombre());
        
        Cliente c4 = new Cliente(4, "Peter", Date.valueOf("1985-11-12"), "email", 'n');
        
        diccionarioClientes.put("cliente 3",c4);
         System.out.println(diccionarioClientes.get("cliente 3").getNombre());
         
         diccionarioClientes.forEach((k,v) -> System.out.println("key: "+k+" value:"+v.getNombre()));
        
    }

    static void ejemploListas() {

        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1, "Pepe", Date.valueOf("1983-04-02"), "email", 'm'));
        listaClientes.add(new Cliente(2, "Manuela", Date.valueOf("1990-02-05"), "email", 'f'));
        listaClientes.add(new Cliente(3, "Sam", Date.valueOf("1978-11-12"), "email", 'n'));

        for (Cliente c : listaClientes) {
            long id = c.getId();
            c.setId(id + 100);
            System.out.println(c.getId() + " " + c.getNombre());
        }
    }

}
