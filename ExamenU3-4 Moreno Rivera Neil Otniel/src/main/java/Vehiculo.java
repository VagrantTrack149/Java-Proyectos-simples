/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Vehiculo {
    public String color;
    public int ruedas;
    public float vel;
    public int cilin;
    public void velocidad(){
        System.out.println("Velocidad permitida: "+vel);
    }
    public void cilin(){
        System.out.println("Cantidad de cilindros regular: "+cilin);
    }
    public void color(){
        System.out.println("Es de color: "+color);
    }
    public void ruedas(){
        System.out.println("Tiene "+ruedas+" cantidad de ruedas");
    }
    public String getColor() {
        return color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public float getVel() {
        return vel;
    }

    public int getCilin() {
        return cilin;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setVel(float vel) {
        this.vel = vel;
    }

    public void setCilin(int cilin) {
        this.cilin = cilin;
    }
    
}
