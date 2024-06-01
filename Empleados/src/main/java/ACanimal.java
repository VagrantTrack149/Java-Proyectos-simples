/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class ACanimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal ani=new Animal();
        ani.setFoto("Animal");
        ani.setLocal("Africa");
        ani.setTamano("Grande o pequeno");
        ani.setTipo_de_comida("Carnivoro");
        ani.rugir();
        System.out.println(ani);
        Felino feli= new Felino();
        feli.setFoto("Felino");
        feli.setLocal("Rusia");
        feli.setTamano("Pequeno/medio");
        feli.setTipo_de_comida("OMNÍVORO");
        feli.rugir();
        System.out.println(feli);
        Leon leo= new Leon();
        leo.setFoto("León");
        leo.setLocal("Africa o zoo");
        leo.setTamano("Grande");
        leo.setTipo_de_comida("Carnivoró");
        leo.rugir();
        System.out.println(leo);
        leo.comer();
        leo.hacer_Ruido();
        Tigre ti= new Tigre();
        ti.setFoto("Tigre");
        ti.setLocal("Africa");
        ti.setTamano("Grande");
        ti.setTipo_de_comida("Carnivoró");
        ti.rugir();
        System.out.println(ti);
        ti.comer();
        ti.hacer_Ruido();
        Gato cat= new Gato();
        cat.setFoto("Gato");
        cat.setLocal("Casas o ciudad");
        cat.setTamano("Pequeño");
        cat.setTipo_de_comida("Omnivoro");
        cat.rugir();
        System.out.println(cat);
        cat.comer();
        cat.hacer_Ruido();
        cat.vacuna();
        Perro dog= new Perro();
        dog.setFoto("Perro");
        dog.setLocal("Casas o campo");
        dog.setTamano("Pequeño,Mediano y grande");
        dog.setTipo_de_comida("Omnivoro");
        dog.rugir();
        System.out.println(dog);
        dog.comer();
        dog.hacer_Ruido();
        dog.vacuna();
        dog.Pasear();
        Lobo wol= new Lobo();
        wol.setFoto("Lobo");
        wol.setLocal("Bosques y lugares frios");
        wol.setTamano("Grande");
        wol.setTipo_de_comida("Carnivoró");
        wol.rugir();
        System.out.println(wol);
        wol.comer();
        wol.hacer_Ruido();
    }
    
}
