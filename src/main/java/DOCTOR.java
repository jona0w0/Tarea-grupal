/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class DOCTOR extends PERSONA {
    private String campo;

    public DOCTOR(String campo, String nombre, int edad) {
        super(nombre, edad);
        this.campo = campo;
    }
    
    public void mostrarDatos(){
        System.out.println("NOMBRE: "+ getNombre() );
          System.out.println("EDAD: "+ getEdad());
            System.out.println("Soy un doctor del campo de: "+ campo);
    }
}
