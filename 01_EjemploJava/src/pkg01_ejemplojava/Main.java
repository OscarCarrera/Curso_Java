/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_ejemplojava;

public class Main {

    public static void main(String[] args) {
        boolean condicion = 5 == 5 && true;
        if (3 < 5) {
            if (condicion || false) {
                System.out.println("Es verdadero");
            } else if (5 > 7) {
                System.out.println("No se ejecuta ");
            } else if (8 > 9) {
                System.out.println("No se ejecuta");
            } else {
                System.out.println("Cualquier otro caso");
            }
        }
        char letra = 'B';
        switch (letra) {
            case 'A':
                System.out.println("Aaaaaaa");
                break;
            case 'B':
                System.out.println("Bbbbbbb");
                break;
            case 'C':
                System.out.println("Ccccccc");
                break;
        }
        System.out.println(nombreApell("Oscar", "Carrera Valero"));
        Tucan miPajaro = new Tucan();
        miPajaro.longitud = 20.5f;
        System.out.println("Long tucan: " + miPajaro.longitud);
        Tucan otroPajaro = new Tucan();
        otroPajaro.longitud = 30.9f;
        System.out.println("Long otro tucan: " + otroPajaro.longitud);
        //Ojo, al asignar un objeto a otro lo que hacemos es que los atributos de ambos apunten a la misma direccion de memoria. 
        //Si cambiamos uno cambiará el otro y viceversa.
        otroPajaro = miPajaro;
        miPajaro.longitud = 67f;
        System.out.println("Long otro tucan: " + otroPajaro.longitud);
    }

    static String nombreApell(String nombre, String apellidos) {
        return apellidos + ", " + nombre;
    }
}
