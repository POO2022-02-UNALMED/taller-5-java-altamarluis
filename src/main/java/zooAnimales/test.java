/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;

/**
 *
 * @author LENOVO
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero an1 = new Mamifero();
	Mamifero an2 = new Mamifero("persona", 50, "ciudad", "F",false, 2);
		
	
	if(an2.getNombre().equals("persona") && an2.getEdad() == 50 && an2.getHabitat().equals("ciudad") && an2.getGenero().equals("F") && an2.isPelaje() == false && an2.getPatas() == 2) {
			System.out.println("bieen");
        } else{
            System.out.println("maal");
        }
	

    }
    
}
