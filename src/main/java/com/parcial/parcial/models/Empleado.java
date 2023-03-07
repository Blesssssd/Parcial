package com.parcial.parcial.models;

import jakarta.validation.constraints.NotEmpty;

public class Empleado {

    @NotEmpty
    private String id;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String correo;
    @NotEmpty
    private String direccion;
    @NotEmpty
    private String telefono;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

}
