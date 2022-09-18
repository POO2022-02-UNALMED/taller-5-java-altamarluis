
package gestion;

import java.util.Arrays;


public class Zoologico {
    private String nombre;
    private String ubicacion;
    private Zona[] zonas;
    
    public Zoologico(String n, String u){
        nombre = n;
        ubicacion = u;
    }
    
    public Zoologico(){
    }
    
    public void agregarZonas(Zona z){
        zonas = Arrays.copyOf(zonas,zonas.length + 1 );
        zonas[zonas.length - 1] = z;
    }
    
    public int cantidadTotalAnimales(){
        int s = 0;
        for (Zona zona : zonas) {
            s += zona.cantidadAnimales();
        }
        return s;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    
    public Zona[] getZonas(){
        return zonas;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setUbicacion(String u){
        ubicacion = u;
    }

   
}
