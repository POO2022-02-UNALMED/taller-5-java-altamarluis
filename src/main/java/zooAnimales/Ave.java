
package zooAnimales;

import java.util.Arrays;

public class Ave extends Animal{
    private static Ave[] listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    
    public Ave(String n, int e, String h, String g, String c){
        super.setNombre(n);
        super.setEdad(e);
        super.setHabitat(h);
        super.setGenero(g);
        colorPlumas = c;
        listado = Arrays.copyOf(listado,listado.length + 1 );
        listado[listado.length - 1] = this;
        Animal.totalAnimales("ave");
        
    }
    
    public Ave(){
        listado = Arrays.copyOf(listado,listado.length + 1 );
        listado[listado.length - 1] = this;
        Animal.totalAnimales("ave");
    }
    
    public static Ave crearHalcon(String n, int e, String g){
        halcones++;
        return new Ave(n,e, "montanas", g, "cafe glorioso");
    }
    
    public static Ave crearAguila(String n, int e, String g){
        aguilas++;
        return new Ave(n,e, "montanas", g, "blanco y amarillo");
    }
    
    public static int cantidadAves(){
        return listado.length;
    }
    
    @Override
    public String movimiento(){
        return "volar";
    }
    
    public String getColorPlumas(){
        return colorPlumas;
    }
   
    public Ave[] getListado(){
        return listado;
    }
  
    public void setColorPlumas(String i){
        colorPlumas = i;
    }
}
