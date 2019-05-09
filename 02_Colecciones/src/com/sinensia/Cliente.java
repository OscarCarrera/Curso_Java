package com.sinensia;

public class Cliente {

    protected long id;
    protected String nombre;
    protected String email;
    protected boolean activo;

    /*public Cliente () { // Constructor por defecto
        
    }*/
    public Cliente(long id, String nombre, String email) //throws Exception
    {
        this.id = id;
        if (nombre==null || nombre=="") {
        //throw new Exception("Nombre de cliente inválido");
        System.err.println("Nombre de cliente inválido");
        }
        this.nombre = nombre;
        this.email = email;
        this.activo = true;
    }

    public long getId() {
        return this.id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void mostrar() {
        System.out.println("Cliente " + nombre);
        System.out.println("Id: " + this.id);
        System.out.println("Email: " + this.email);

    }

}
