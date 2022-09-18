
package gestion;

import java.util.Arrays;
import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private Animal[] animales;
    
    public Zona(String n, Zoologico z){
        nombre = n;
        zoo = z;
    }
    
    public Zona(){
    }
    
    public void agregarAnimales(Animal a){
        animales = Arrays.copyOf(animales,animales.length + 1 );
        animales[animales.length - 1] = a;
    }
    
    public int cantidadAnimales(){
        return animales.length;
    }
    
    public Zoologico getZoo(){
        return zoo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Animal[] getAnimales(){
        return animales;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setZoo(Zoologico z){
        zoo = z;
    }

    
}
