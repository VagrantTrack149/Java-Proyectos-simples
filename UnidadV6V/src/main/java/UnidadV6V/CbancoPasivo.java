package UnidadV6V;
public class CbancoPasivo extends Cbanco{
    @Override
    public void debe(float retiro){
        float asiento=this.getSaldo();
       if(this.saldo<=retiro)
            this.saldo=this.saldo-retiro;
            
   }
       public void haber(float saldo){

       this.saldo=this.saldo-saldo;
            
   }
}
