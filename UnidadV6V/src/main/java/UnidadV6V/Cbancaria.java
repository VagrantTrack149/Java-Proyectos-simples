
package UnidadV6V;

public class Cbancaria {
   private float saldo,interes;
   private int cliente,cuenta;
   public Cbancaria(){
       
   }
   public Cbancaria(int cuenta,float saldo,float interes){
       this.cuenta=cuenta;
       this.saldo=saldo;
       this.interes=interes;
   }

   public void actualizarSaldo(float saldo){
       this.saldo=saldo;
   }
   public void ingresarSaldo(float ingreso){
      this.saldo=this.saldo+ingreso;
   }
   public void retiraSaldo(float retiro){
       if(this.saldo<=retiro){
       this.saldo=this.saldo-retiro;
            }
   }
   public String mostrar(){
      String cadena=" ";
      cadena=cadena+"Cliente____:"+this.cliente+"\n";
      cadena=cadena+"Cuenta____:"+this.cuenta+"\n";
      cadena=cadena+"saldo____:"+this.saldo+"\n";
      cadena=cadena+"interes____:"+this.interes+"\n";
      return (cadena);
      
   }
   
}
