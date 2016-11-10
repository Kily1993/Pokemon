/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursobadajoz_vectores02;

import java.util.ArrayList;

/**
 *
 * @author jesus
 */
public class Persona {
    private String nombre;
    private int edad;
    public static ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    //int numPokemons = 0; //inicialmente tenemos cero pokemons en el vector siguiente
    //private Pokemon[] pokemons = new Pokemon[10];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public  ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public  void setPokemons(ArrayList<Pokemon> pokemons) {
        Persona.pokemons = pokemons;
    }

   
    public void addPokemon (Pokemon pok){
            this.pokemons.add(pok);
    }
 

    
    
    
    
    
}
