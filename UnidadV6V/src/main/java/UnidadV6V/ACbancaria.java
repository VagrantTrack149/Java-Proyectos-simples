
package UnidadV6V;

public class ACbancaria {
    public static void main(String[]args){
     Cbancaria cuenta01=new Cbancaria();
     Cbancaria cuenta02=new Cbancaria(101010,(float)5000.50,5);
     cuenta02.retiraSaldo(5001);
     cuenta02.ingresarSaldo(10000);
     cuenta01.actualizarSaldo(5000);
     cuenta01.ingresarSaldo(10000);
     cuenta02.ingresarSaldo(15000);
     System.out.println("cta 02"+cuenta02.mostrar()); 
     System.out.println("cta 12"+cuenta01.mostrar());
     
 }   
}
