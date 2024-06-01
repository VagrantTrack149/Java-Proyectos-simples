/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnidadV6V;

/**
 *
 * @author fourr
 */
public class Cbanco {
    float saldo;
        public float interes;
   public int cliente,cuenta;
   float aux=0;
   public String nombre;
   public String Tipo_de_cuenta;
   public String Tipo_de_Cliente;
   public String espe;
   public String te;
   public String movi;
   public Cbanco(){
       
   }
   public Cbanco(int cuenta,float saldo,float interes){
       this.cuenta=cuenta;
       this.saldo=saldo;
       this.interes=interes;
       
   }

   public void actualizarSaldo(float saldo){
       this.saldo=saldo;
   }
   public float getSaldo(){
       return (saldo);
   }
   public float setSaldo(float asiento)throws CbancoExcepcion{
    if(saldo>=0){
       this.saldo=asiento;}
    else{
    throw new CbancoExcepcion("No posee ningun saldo");
    }
    return(saldo); 
   }   

    public String getEspe() {
        return espe;
    }

    public void setEspe(String espe) {
        this.espe = espe;
    }
   
    public float getInteres() {
        return interes;
    }

    public int getCliente() {
        return cliente;
    }

    public int getCuenta() {
        return cuenta;
    }

    public String getTe() {
        return te;
    }

    public String getMovi() {
        return movi;
    }

    public void setMovi(String movi) {
        this.movi = movi;
    }
    public void setTe(String te) {
        this.te = te;
    }
    public String getTipo_de_Cliente() {
        return Tipo_de_Cliente;
    }

    public void setTipo_de_Cliente(String Tipo_de_Cliente) {
        this.Tipo_de_Cliente = Tipo_de_Cliente;
    }
    public void setInteres(float interes) throws CbancoExcepcion{
        if(interes>=100 || interes<0){
            throw new CbancoExcepcion("El interés debe de ser menor o igual a 100, no puede se negativo");
        }
        else{
        this.interes = interes;
        }
    }

    public String getTipo_de_cuenta() {
        return Tipo_de_cuenta;
    }

    public void setTipo_de_cuenta(String Tipo_de_cuenta) {
        this.Tipo_de_cuenta = Tipo_de_cuenta;
    }
    
    public void setCliente(int cliente) throws Cbancoidentificador{
       if(cliente>=10000 && cuenta<100000){
        this.cliente = cliente;
        aux=cliente/10000;
       if(aux<20){
           Tipo_de_Cliente=("Nacional");
       }
       if(aux<30){
           Tipo_de_Cliente=("Local");
       }
       if(aux<40){
           Tipo_de_Cliente=("Esporádico ");
       }
       if(aux<50){
           Tipo_de_Cliente=("Con descuento especial");
       }
       if(aux>=50){
           throw new Cbancoidentificador("El cliente debe comenzar por los digitos 10, 20, 30 o 40");
       }
       }}
    public void setCuenta(int cuenta) throws CbancoExcepcion{
     if(cuenta>999 && cuenta<10000){
         this.cuenta = cuenta;
     }else{
     throw new CbancoExcepcion("El numero de la cuenta es de 4 digitos");
    }}
   
   public void debe(float ingreso){
      this.saldo=this.saldo+ingreso;
   }
   public void haber(float retiro){
       if(this.saldo<=retiro){
       this.saldo=this.saldo-retiro;
            }
   }
   public String mostrar(){
      String cadena=" ";
      cadena=cadena+"Descripción: "+this.espe+"\n";
      cadena=cadena+"Cliente:" +this.cliente+"\n";
      cadena=cadena+"Cuenta:" +this.cuenta+"\n";
      cadena=cadena+"saldo:" +this.saldo+"\n";
      cadena=cadena+"interes: "+this.interes+"\n";
      cadena=cadena+"Tipo: "+this.Tipo_de_cuenta+"\n";
      cadena=cadena+"Movimiento: "+this.movi+"\n";
      return (cadena);
      
   }
    @Override
   public String toString(){
      String cadena=" ";
      cadena=cadena+"Descripción: "+this.espe+"\t";
      cadena=cadena+"Cliente:" +this.cliente+"\t";
      cadena=cadena+"Cuenta:" +this.cuenta+"\t";
      cadena=cadena+"saldo:" +this.saldo+"\t";
      cadena=cadena+"interes: "+this.interes+"\t";
      cadena=cadena+"Tipo: "+this.Tipo_de_cuenta+"\t";
      cadena=cadena+"Movimiento: "+this.movi+"\t"+"\n";
      return (cadena);
      
   }
}
