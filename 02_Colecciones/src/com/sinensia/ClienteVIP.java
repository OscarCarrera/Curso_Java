/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia;

/**
 *
 * @author Admin
 */
public class ClienteVIP extends Cliente{
    
    private double beneficios;

    public ClienteVIP(double beneficios, long id, String nombre, String email) {
        super(id, nombre, email);
        this.beneficios = beneficios;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }
    
    @Override
     public void mostrar() {
        System.out.println("Cliente VIP " + nombre);
        System.out.println("Id: " + this.id);
        System.out.println("Email: " + this.email);
        System.out.println("Beneficios: "+ beneficios);

    }
    
    
    
}
