/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;

import java.util.ArrayList;


public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    
    public Anfibio(String n, int e, String h, String g, String c, boolean v){
        super.setNombre(n);
        super.setEdad(e);
        super.setHabitat(h);
        super.setGenero(g);
        colorPiel = c;
        venenoso = v;
        listado.add(this);
        Animal.totalAnimales("anfibio");
        
    }
    
    public Anfibio(){
        listado.add(this);
        Animal.totalAnimales("anfibio");
    }
    
    public static Anfibio crearRana(String n, int e, String g){
        ranas++;
        return new Anfibio(n,e, "selva", g, "rojo",true);
    }
    
    public static Anfibio crearSalamandra(String n, int e, String g){
        salamandras++;
        return new Anfibio(n,e, "selva", g, "negro y amarillo", false);
    }
    
    public static int cantidadPeces(){
        return listado.size();
    }
    
    @Override
    public String movimiento(){
        return "saltar";
    }
    
     public String getColorPiel(){
        return colorPiel;
    }
    
    public boolean isVenenoso(){
        return venenoso;
    }
    
    public ArrayList<Anfibio> getListado(){
        return listado;
    }
    
    public void setColorPiel(String p){
        colorPiel = p;
    }
    
    public void setVenenoso(boolean i){
        venenoso = i;
    }
}
