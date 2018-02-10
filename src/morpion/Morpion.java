/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;
import java.util.Scanner;
/**
 *
 * @author lapie
 */
public class Morpion {
    
    private int[][] grille;
    private boolean fini;
    private int numjoueur;
    private int nbCasesVides;
    
    public Morpion(int numjoueur){
        
        this.numjoueur = numjoueur;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                this.grille[i][j] = 0; 
            }
        }
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
    
    
    
}
