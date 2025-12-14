/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acquario;

/**
 *
 * @author sarap
 */
public class Acquario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AcquarioClass a1 = new AcquarioClass();
        AnimaleMarino an1 = new AnimaleMarino(2);
        AnimaleMarino an2 = new AnimaleMarinoErbivoro(2, 40);
        Vasca v1 = new Vasca(20,6,8);
        
        a1.aggiungiAnimale(an2);
        a1.aggiungiAnimale(an1);
        a1.malattia();
        
        an1.controlloStato();
        an2.controlloStato();
        
        System.out.println(an1.ToString());
        
    }
    
}
