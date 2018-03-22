package com.example.usuario.juevesandroid;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 22/03/2018.
 */

class PersonasSingleton {
    private static final PersonasSingleton ourInstance = new PersonasSingleton();

    private List<Persona> listaPersonas = new ArrayList<>();




    static PersonasSingleton getInstance() {

        return ourInstance;

    }

    private PersonasSingleton() {
    }

    public boolean add(Persona persona) {

        return listaPersonas.add(persona);
    }

    public boolean remove(Object o) {
        return listaPersonas.remove(o);
    }

    public Persona get(int index) {
        return listaPersonas.get(index);
    }

    public Persona set(int index, Persona element) {
        return listaPersonas.set(index, element);
    }

    public void add(int index, Persona element) {
        listaPersonas.add(index, element);
    }

    public Persona remove(int index) {
        return listaPersonas.remove(index);
    }

    public int indexOf(Object o) {
        return listaPersonas.indexOf(o);
    }

    public List<Persona> getListaPersonas () {
        return listaPersonas;
    }

}
