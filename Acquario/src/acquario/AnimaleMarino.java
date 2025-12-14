/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acquario;

/**
 *
 * @author sarap
 */
public class AnimaleMarino {
    private boolean stress;
    protected int salute;
    private int livPericolosita;
    private Vasca vasca;
    
    public AnimaleMarino(int lp){
        this.stress = false;
        this.salute = 80;
        this.livPericolosita = lp;
    }
    
    public void setSalute(int s){
        this.salute = s;
    }
    
    public void setVasca(Vasca v){
        this.vasca =v;
    }
    
    public void controlloStress(){
        if(vasca != null && vasca.getTemperatura() > 25){
            this.stress = true;
            System.out.println("Animale Stressato!!!");
        }
        else{
            System.out.println("Animale non Stressato!!!");
        }
    }
    
    public void controlloStato(){
        if(salute < 20){
            System.out.println("Animale a rischio!!!");
        }
        else{
            System.out.println("Animale in salute!!!");
        }
    }
    
    public void controlloPh(){
        if(vasca.getPh() == 1){
            livPericolosita++;
            System.out.println("L'animale diventa aggressivo! Ristabilisci il ph");
        }
    }
    
    public String ToString(){
        return "Livello di pericolosità: " + this.livPericolosita + "\nSalute: " + this.salute + "\nStress: " + this.stress;
    }
    
}
