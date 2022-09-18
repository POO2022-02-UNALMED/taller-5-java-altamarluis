
package zooAnimales;

import java.util.Arrays;


public class Mamifero extends Animal {
    private static Mamifero[] listado;
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
        listado = Arrays.copyOf(listado,listado.length + 1 );
        listado[listado.length - 1] = this;
        Animal.totalAnimales("mamifero");
        
    }
    
    public Mamifero(){
        listado = Arrays.copyOf(listado,listado.length + 1 );
        listado[listado.length - 1] = this;
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
        return listado.length;
    }
    
    public boolean getPelaje(){
        return pelaje;
    }
    
    public int getPatas(){
        return patas;
    }
    
    public Mamifero[] getListado(){
        return listado;
    }
    
    public void setPelaje(boolean p){
        pelaje = p;
    }
    
    public void setPatas(int i){
        patas = i;
    }
    
    
}
