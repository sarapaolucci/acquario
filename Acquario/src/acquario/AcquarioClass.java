/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acquario;

import java.util.ArrayList;

/**
 *
 * @author sarap
 */
public class AcquarioClass {
    private ArrayList <AnimaleMarino> animali;
    
    public AcquarioClass(){
        animali = new ArrayList();
    }
    
    public void aggiungiAnimale(AnimaleMarino a){
        if(animali.contains(a) == false){
            animali.add(a);
        }
    }
    
    public void rimuoviAnimale(AnimaleMarino a){
        if(animali.contains(a) == true){
            animali.remove(a);
        }
    }
    
    public void malattia(){
        for(int i = 0; i < animali.size(); i++){
            animali.get(i).setSalute(10);
        }
    }
    
}
