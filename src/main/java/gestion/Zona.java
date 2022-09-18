
package gestion;

import java.util.ArrayList;
import java.util.Arrays;
import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList();
    
    public Zona(String n, Zoologico z){
        nombre = n;
        zoo = z;
    }
    
    public Zona(){
    }
    
    public void agregarAnimales(Animal a){
        animales.add(a);
    }
    
    public int cantidadAnimales(){
        return animales.size();
    }
    
    public Zoologico getZoo(){
        return zoo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public ArrayList<Animal> getAnimales(){
        return animales;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setZoo(Zoologico z){
        zoo = z;
    }

    
}
