/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class DEPORTISTA extends PERSONA {
    private String deporte;

    public DEPORTISTA(String deporte, String nombre, int edad) {
        super(nombre, edad);
        this.deporte = deporte;
    }
    
    public void mostrarDatos(){
        System.out.println("NOMBRE: "+ getNombre() );
          System.out.println("EDAD: "+ getEdad());
            System.out.println("Soy un deportista de: "+ deporte);
    }
}