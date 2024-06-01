/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Bicicleta extends Vehiculo{
    public int ruedas=2;
    public String tipo;
    public void tipo(){
         System.out.println("La bicicleta es: "+tipo);
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
