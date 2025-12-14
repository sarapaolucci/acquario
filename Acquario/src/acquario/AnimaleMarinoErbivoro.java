/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acquario;

/**
 *
 * @author sarap
 */
public class AnimaleMarinoErbivoro extends AnimaleMarino{
    private int numAlghe;
    
    public AnimaleMarinoErbivoro(int lp,int a){
        super(lp);
        this.numAlghe = a;
    }
    
    public void controllaStato(){
        if(numAlghe < 5){
            salute = 5;
            System.out.println("Animale a rischio! Serve più cibo");
        }
    }
    
}
