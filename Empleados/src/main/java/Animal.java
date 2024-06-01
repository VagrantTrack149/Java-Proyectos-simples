/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Animal {
    private String foto;
    private String tipo_de_comida;
    private String tamano;
    private String local;
    public void hacer_Ruido(){
        System.out.println("Haciendo ruido");
    }
    public void comer(){
        System.out.println("Comiendo");
    }
    public void rugir(){
        System.out.println("Rugir");
    }
    public void dormir(){
        System.out.println("Dormir");
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setTipo_de_comida(String tipo_de_comida) {
        this.tipo_de_comida = tipo_de_comida;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getFoto() {
        return foto;
    }

    public String getTipo_de_comida() {
        return tipo_de_comida;
    }

    public String getTamano() {
        return tamano;
    }

    public String getLocal() {
        return local;
    }
    @Override
    public String toString(){
        String ca="";
        ca="\nFoto"+foto+"\nTipo de comida"+tipo_de_comida+"\nTamaño"+tamano+"\nLocalizacion\n"+local;
        return ca;
    }
}
