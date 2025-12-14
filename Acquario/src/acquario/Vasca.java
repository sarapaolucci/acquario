/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acquario;

/**
 *
 * @author sarap
 */
public class Vasca {
    private double temperatura;
    private double ph;
    private int livOssigeno;
    private boolean luce;
    
    public Vasca(double t, double ph, int l){
        this.temperatura = t;
        this.ph = ph;
        this.livOssigeno = l;
        this.luce = true;
    }
    
    public double getTemperatura(){
        return this.temperatura;
    }
    
    public double getPh(){
        return this.ph;
    }
    
}
