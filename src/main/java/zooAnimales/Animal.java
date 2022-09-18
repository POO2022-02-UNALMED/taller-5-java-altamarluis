
package zooAnimales;

import gestion.Zona;

public class Animal {
    
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;
    
    private static int m, av, r, p, an;
    
    
    public Animal(String n, int e, String h, String g){
        nombre = n;
        edad = e;
        habitat = h;
        genero = g;   
    }
    
    public Animal(){
    }
    
    public static String totalPorTipo(){
        return "Mamiferos: " + m +"\nAves: " + av + "\nReptiles: " + r + "\nPeces: " + p + "\nAnfibios: " + an;
    }
    
    @Override
    public String toString(){
        if (zona == null){
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero;
        } else{
           return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + zona.getNombre() + ", en el " + zona.getZoo(); 
        }
        
    }
    
    public String movimiento(){
        return "desplazarse";
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getHabitat(){
        return habitat;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public Zona getZona(){
        return zona;
    }
    
    public int getTotalAnimales(){
        return totalAnimales;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setEdad(int e){
        edad = e;
    }
    
    public void setHabitat(String h){
        habitat = h;
    }
    
    public void setGenero(String g){
        genero = g;
    }
    
    public void setZona(Zona g){
        zona = g;
        zona.agregarAnimales(this);
    }
    
    public static void totalAnimales(String t){
        totalAnimales++;
        switch (t) {
            case "mamifero":
                m++;
                break;
            case "ave":
                av++;
                break;
            case "reptil":
                r++;
                break;
            case "pez":
                p++;
                break;
            case "anfibio":
                an++;
                break;
            default:
                break;
        }
    }
    
    
    
    
    
    
}