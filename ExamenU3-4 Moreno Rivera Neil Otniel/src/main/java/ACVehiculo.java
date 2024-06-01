/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class ACVehiculo {
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int op=0;
       Coche carro=new Coche();
        carro.setColor("Verde");
        carro.setCilin(4);
        carro.setVel(120);
        carro.setRuedas(4);
       Camioneta camioneta= new Camioneta();
       camioneta.setColor("roja");
        camioneta.setCilin(6);
        camioneta.setVel(80);
        camioneta.setRuedas(4);
        camioneta.setCarga(600);
       Bicicleta Bici=new Bicicleta();
       Bici.setColor("Azul");
       Bici.setRuedas(2);
       Bici.setTipo("Urbana");
       Bici.setVel(50);
       Motocicleta moto=new Motocicleta();
       moto.setColor("negra");
       moto.setTipo("Deportiva");
        moto.setCilin(4);
        moto.setVel(150);
        moto.setRuedas(2);
       do{
       System.out.println("1.-Mostar vehiculos de 4 ruedas\n");
       System.out.println("2.-Mostar vehiculos de 2 ruedas\n");
       System.out.println("3.-Salir\n");
       op=leer.nextInt();
       switch(op){
           case 1: 
               op=1;
               System.out.println("\nCarro\n");
               carro.color();
               carro.ruedas();
               carro.velocidad();
               carro.cilin();
               System.out.println("\nCamioneta\n");
               camioneta.color();
               camioneta.ruedas();
               camioneta.velocidad();
               camioneta.cilin();
               camioneta.carga();
               break;
           case 2:
               op=2;
               System.out.println("\nBicicleta\n");
               Bici.color();
               Bici.ruedas();
               Bici.velocidad();
               Bici.tipo();
               System.out.println("\nMotocicleta\n");
               moto.color();
               moto.ruedas();
               moto.velocidad();
               moto.cilin();
               moto.tipo();
               break;
       }
       }while(op!=3);
          
    }
    
}
