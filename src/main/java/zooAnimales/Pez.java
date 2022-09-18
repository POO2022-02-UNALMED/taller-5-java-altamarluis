
package zooAnimales;

import java.util.ArrayList;


public class Pez extends Animal{
    private static ArrayList<Pez> listado = new ArrayList();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    
    public Pez(String n, int e, String h, String g, String c, int l){
        super.setNombre(n);
        super.setEdad(e);
        super.setHabitat(h);
        super.setGenero(g);
        colorEscamas = c;
        cantidadAletas = l;
        listado.add(this);
        Animal.totalAnimales("pez");
        
    }
    
    public Pez(){
        listado.add(this);
        Animal.totalAnimales("pez");
    }
    
    public static Pez crearSalmon(String n, int e, String g){
        salmones++;
        return new Pez(n,e, "oceano", g, "rojo",6);
    }
    
    public static Pez crearBacalao(String n, int e, String g){
        bacalaos++;
        return new Pez(n,e, "oceano", g, "gris", 6);
    }
    
    public static int cantidadPeces(){
        return listado.size();
    }
    
    @Override
    public String movimiento(){
        return "nadar";
    }
    
    public String getColorEscamas(){
        return colorEscamas;
    }
    
    public int getCantidadAletas(){
        return cantidadAletas;
    }
    
    public ArrayList<Pez> getListado(){
        return listado;
    }
    
    public void setColorEscamas(String p){
        colorEscamas = p;
    }
    
    public void setCantidadAletas(int i){
        cantidadAletas = i;
    }
    
}
