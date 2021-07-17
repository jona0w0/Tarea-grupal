/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     DOCTOR doctor1 = new DOCTOR ("BIOLOGIA","ALVARO MEDRAN", 50);
     
     doctor1.mostrarDatos();
     
     System.out.println("---------------------------------------------------------------------");
     
     
     DEPORTISTA deportista1 = new DEPORTISTA ("FUTBOL", "CRISTIANO RONALDO", 40);
     deportista1.mostrarDatos();
    }
    
}
