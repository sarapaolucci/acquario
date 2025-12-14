/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acquario;

/**
 *
 * @author sarap
 */
public class AnimaleMarinoCarnivoro extends AnimaleMarino{
    private int carne;
    
    public AnimaleMarinoCarnivoro(int lp, int c){
        super(lp);
        this.carne = c;
    }
    
    public void controllaStato(){
        if(carne > 20){
            salute = 100;
            System.out.println("Animale in ottima forma!!!");
        }
    }
}
