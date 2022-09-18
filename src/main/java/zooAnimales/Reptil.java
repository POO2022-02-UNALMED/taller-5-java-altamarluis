/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Reptil extends Animal{
    private static ArrayList<Reptil> listado = new ArrayList();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    
    public Reptil(String n, int e, String h, String g, String c, int l){
        super.setNombre(n);
        super.setEdad(e);
        super.setHabitat(h);
        super.setGenero(g);
        colorEscamas = c;
        largoCola = l;
        listado.add(this);
        Animal.totalAnimales("reptil");
        
    }
    
    public Reptil(){
        listado.add(this);
        Animal.totalAnimales("reptil");
    }
    
    public static Reptil crearIguana(String n, int e, String g){
        iguanas++;
        return new Reptil(n,e, "humedal", g, "verde", 3);
    }
    
    public static Reptil crearSerpiente(String n, int e, String g){
        serpientes++;
        return new Reptil(n,e, "jungla", g, "blanco", 1);
    }
    
    public static int cantidadReptiles(){
        return listado.size();
    }
    
     @Override
    public String movimiento(){
        return "reptar";
    }
    
    public String getColorEscamas(){
        return colorEscamas;
    }
    
    public int getLargoCola(){
        return largoCola;
    }
    
    public ArrayList<Reptil> getListado(){
        return listado;
    }
    
    public void setColorEscamas(String p){
        colorEscamas = p;
    }
    
    public void setLargoCola(int i){
        largoCola = i;
    }
}
