package com.example.usuario.juevesandroid;

import java.io.Serializable;

/**
 * Created by Usuario on 22/03/2018.
 */

public class Persona implements Serializable{

    private static String nombre;
    private static String apellido1;
    private static String apellido2;

    public Persona (String nombre, String apellido1, String apellido2) {

        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;

    }


    public static String getNombre() {
        return nombre;
    }

    public static void setName(String nombre) {
        Persona.nombre = nombre;
    }

    public static String getApellido1() {
        return apellido1;
    }

    public static void setApellido1(String apellido1) {
        Persona.apellido1 = apellido1;
    }

    public static String getApellido2() {
        return apellido2;
    }

    public static void setApellido2(String apellido2) {
        Persona.apellido2 = apellido2;
    }




}
