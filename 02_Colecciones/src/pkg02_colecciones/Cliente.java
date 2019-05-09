package pkg02_colecciones;

import java.util.Date;

public class Cliente {

    private long id;
    private String nombre;
    private Date fechaNac;
    private String email;
    private char genero;
    private boolean activo;

    public Cliente(long id, String nombre, Date fechaNac, String email, char genero) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.email = email;
        this.genero = genero;
        this.activo=true;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
