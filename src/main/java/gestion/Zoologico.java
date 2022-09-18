
package gestion;

import java.util.ArrayList;
import java.util.Arrays;


public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList();
    
    public Zoologico(String n, String u){
        nombre = n;
        ubicacion = u;
    }
    
    public Zoologico(){
    }
    
    public void agregarZonas(Zona z){
        zonas.add(z);
    }
    
    public int cantidadTotalAnimales(){
        int s = 0;
        for (int i = 0; i < zonas.size(); i++){
            s += zonas.get(i).cantidadAnimales();
        }
        return s;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    
    public ArrayList<Zona> getZona(){
        return zonas;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setUbicacion(String u){
        ubicacion = u;
    }

   
}
