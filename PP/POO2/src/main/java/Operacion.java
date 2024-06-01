package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //atributos//
    float numero1;
    float numero2;
    float suma;
    float resta;
    float mult;
    double division;
    //metodos//
    //metodo para el ingreso de dos numeros//
    public void leer_numero(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("digita un numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("digita un numero"));
    }
    public void sumar(){
        suma=numero1+numero2;
    }
    public void restar(){
        resta=numero1-numero2;
    }
    public void multiplicar(){
        mult=numero1*numero2;
    }
    public void divividir(){
        division=numero1/numero2;
    }
    public void mostrar_resultados(){
        System.out.println("Los números introducidos fueron :"+numero1);
        System.out.println(numero2);
        System.out.println("la suma es:"+suma);
        System.out.println("la resta es:"+resta);
        System.out.println("la division es:"+division);
        System.out.println("la multiplicacion: "+mult);
    }

}
