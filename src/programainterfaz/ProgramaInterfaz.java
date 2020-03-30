/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programainterfaz;

/**
 *
 * @author Usuario
 */
public class ProgramaInterfaz{

	public static void main(String arg[]) { 
        Persona pavaroti = new Persona(); 
        hacerCantar((PuedeCantar) pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin); 
        
        Burro miAmigo = new Burro();
            hacerCantar(miAmigo);
       
    } 

    public static void hacerCantar(PuedeCantar cantor) { 
        cantor.cantar(); 
    } 
}

