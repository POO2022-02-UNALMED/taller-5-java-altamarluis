
package zooAnimales;

import java.util.ArrayList;



public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado = new ArrayList();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;
    
    public Mamifero(String n, int e, String h, String g, boolean p, int pa){
        super.setNombre(n);
        super.setEdad(e);
        super.setHabitat(h);
        super.setGenero(g);
        pelaje = p;
        patas = pa;
        listado.add(this);
        Animal.totalAnimales("mamifero");
        
    }
    
    public Mamifero(){
        pelaje = false;
        patas = 0;
        listado.add(this);
        Animal.totalAnimales("mamifero");
    }
    
    public static Mamifero crearCaballo(String n, int e, String g){
        caballos++;
        return new Mamifero(n,e, "pradera", g, true, 4);
    }
    
    public static Mamifero crearLeon(String n, int e, String g){
        leones++;
        return new Mamifero(n,e, "selva", g, true, 4);
    }
    
    public static int cantidadMamiferos(){
        return listado.size();
    }
    
    public boolean isPelaje(){
        return pelaje;
    }
    
    public int getPatas(){
        return patas;
    }
    
    public ArrayList<Mamifero> getListado(){
        return listado;
    }
    
    public void setPelaje(boolean p){
        pelaje = p;
    }
    
    public void setPatas(int i){
        patas = i;
    }
    
    
}
