/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Camioneta extends Coche{
    public float carga;
    public void carga(){
        System.out.println("Carga máxima: "+carga);
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }
    
}
