/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.pruebas;

import com.sinensia.Cliente;
import com.sinensia.ClienteInvitado;
import com.sinensia.ClienteVIP;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


/**
 *
 * @author Admin
 */
public class Polimorfismo {

    public static void polimorfeando() {
        ClienteInvitado invitado;
        invitado = new ClienteInvitado(0, "Juan", null);
        invitado.setDuracionMax(10);
        //invitado.mostrar();

        // Este es un objeto de tipo Cliente Invitado
        // con la forma de Cliente
        Cliente clienteNormal = invitado;
        //clienteNormal.mostrar();
//        System.out.println("Nombre: " 
//                + clienteNormal.getNombre());
//        
        ClienteInvitado elMismoInv = (ClienteInvitado) clienteNormal;

        //Provoca una excepcion al intentar castear un padre a la forma de un hijo
//        Cliente normal = new Cliente(0, "", null);
//        ClienteInvitado normalEnIvit = (ClienteInvitado) normal;
//        System.out.println("Nombre: " 
//                + normalEnIvit.getDuracionMax());
        Cliente c1 = new Cliente(0, "Juanito", null);
        Cliente c2 = new Cliente(0, "Raquel", null);
        ClienteVIP cvip1 = new ClienteVIP(326.5, 0, "Manuel", null);
        ClienteVIP cvip2 = new ClienteVIP(287.4, 0, "Pepito", null);
        ClienteInvitado cInv1 = new ClienteInvitado(0, "Enrique", null);
        ClienteInvitado cInv2 = new ClienteInvitado(0, "Maria", null);
        cInv1.setDuracionMax(10);
        cInv2.setDuracionMax(20);

        ArrayList<Cliente> listaclientes = new ArrayList<>();
        listaclientes.add(c1);
        listaclientes.add(c2);
        listaclientes.add(c2); //el listado admite duplicados
        listaclientes.add(cvip1);
        listaclientes.add(cvip2);
        listaclientes.add(cInv1);
        listaclientes.add(cInv2);

        listaclientes.forEach((o) ->  o.mostrar());
        
        HashMap<String, Cliente> map = new HashMap();
        map.put("1", c1);
        map.put("2", c2);
        map.put("2",c2);// No sale este elemento no admite duplicados
        map.put("3", cvip1);
        map.put("4", cvip2);
        map.put("5", cInv1);
        map.put("6", cInv2);

        ClienteVIP cv=(ClienteVIP) map.get("3");
        cv.setBeneficios(100.34);
        cv.setNombre("Macareno");
        map.put("3",cvip1);
                
//        map.get("3").setNombre("Macareno");
//        map.get("3").
        
        map.forEach((k, v) -> {
            
            if (v instanceof ClienteVIP) {
            ((ClienteVIP) v).setBeneficios(((ClienteVIP) v).getBeneficios()+1000);                                
            }
            else if (v instanceof ClienteInvitado){
            ((ClienteInvitado) v).setDuracionMax(((ClienteInvitado) v).getDuracionMax()+50);
            }
            System.out.println(k);
            v.mostrar();
        });
    }
}
