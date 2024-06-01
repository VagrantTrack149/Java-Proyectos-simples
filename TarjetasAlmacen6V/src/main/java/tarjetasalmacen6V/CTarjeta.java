/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetasalmacen6V;

/**
 *
 * @author riky_
 */
import java.io.Serializable;
import javax.swing.JTextField;
public class CTarjeta implements Serializable
{
    private int Numero;
    private String Descripcion;
    private int Existencia;
    private int Stock_Minimo;
    private int Stock_Maximo;
public CTarjeta()
{
    
}
public CTarjeta(int n, String d, int e, int emin, int smax)
{
    this.Numero=n;
    this.Descripcion=d;
    this.Existencia=e;
    this.Stock_Maximo=smax;
    this.Stock_Minimo=emin;
}

    CTarjeta(int t_numero, String text, JTextField txt_exis, JTextField txt_min, JTextField txt_max) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setExistencia(int Existencia) {
        this.Existencia = Existencia;
    }

    public void setStock_Minimo(int Stock_Minimo) {
        this.Stock_Minimo = Stock_Minimo;
    }

    public void setStock_Maximo(int Stock_Maximo) {
        this.Stock_Maximo = Stock_Maximo;
    }

    public int getNumero() {
        return Numero;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getExistencia() {
        return Existencia;
    }

    public int getStock_Minimo() {
        return Stock_Minimo;
    }

    public int getStock_Maximo() {
        return Stock_Maximo;
    }

       
}
