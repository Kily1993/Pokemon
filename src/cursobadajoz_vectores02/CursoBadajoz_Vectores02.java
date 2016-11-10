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
public class CursoBadajoz_Vectores02 {

    //private static Persona [] miVectorPersonas = new Persona [100];
    public static ArrayList<Persona> personas = new ArrayList<Persona>();
    
    public static void rellenarDatos() {
        
        Persona p;
        Pokemon pok;
        for (int i = 0; i < 100; i++) {
            p = new Persona();
            p.setNombre("LahPathri " + i);
            p.setEdad((int) (Math.random() * (40 - 18) + 18));
            
            for (int j = 0; j < 10; j++) {
                pok = new Pokemon();
                pok.setNombre("Pikachu " +j+i);
                pok.setPuntuacion((int) (Math.random() * 100));
                personas.get(i).addPokemon(pok);
            }
            personas.add(p);
        }
        
    }
    
    public static void ejercicio01() {
        //Mostrar el nombre de todas las personas
        /*for (int i=0; i < miVectorPersonas.length;i++) {
            System.out.println(miVectorPersonas[i].getNombre());
        }*/
        
    }
    
    public static void ejercicio02() {
        //Mostrar la edad de todas las personas
        /*for (int i=0; i < miVectorPersonas.length;i++) {
            System.out.println(miVectorPersonas[i].getEdad());
        }*/
        
    }
    
    public static void ejercicio03() {

        //Mostrar el nombre de la persona de mayor edad
        /*int mayoredad = miVectorPersonas[0].getEdad();     
          int j = 0;
            for(int i=0;i<miVectorPersonas.length;i++){
                if(miVectorPersonas[i].getEdad()>mayoredad){
                     mayoredad=miVectorPersonas[i].getEdad();
                     j=i;
                }
            }
            System.out.println(miVectorPersonas[j].getNombre());*/
    }
    
    public static void ejercicio04() {
        //Mostrar el nombre de todos los pokemons
        /*for (int i=0; i < miVectorPersonas.length;i++) {
             for(int j=0;j < miVectorPersonas[i].getPokemons().length;j++){
                 
                      System.out.println(miVectorPersonas[i].getPokemons()[j].getNombre());
             }
        }*/
    }
    
    public static void ejercicio05() {
        //EJERCICIO COMPLEJO - Mostrar el pokemon que tiene mayor puntuación

        /*int mayorpunt = 0;
          
            for(int i=0;i<miVectorPersonas.length;i++){
                for(int j=0;j < miVectorPersonas[i].getPokemons().length;j++){
                    if(miVectorPersonas[i].getPokemons()[j].getPuntuacion()>0){
                        mayorpunt=miVectorPersonas[i].getPokemons()[j].getPuntuacion();
                     
                    }
                }
            }
           
             System.out.println(mayorpunt);*/
    }
    
    public static void main(String[] args) {
        rellenarDatos();
        
        ejercicio01();
        //ejercicio02();
        //ejercicio03();
        //ejercicio04();
        //ejercicio05();
        
    }
    
}
