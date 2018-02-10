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
        this.fini = false;
        this.nbCasesVides = 9;
        
        //initialise la grille
        this.grille = new int[3][3];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                this.grille[i][j] = 0; 
            }
        }
    }
    
    public int[] saisiChoix(){
        
        Scanner sc = new Scanner(System.in);
        int[] coor = new int[2];
        boolean correct = false; 
        
        while(!correct){
            
            System.out.println("Entrez une ligne ");
            int ligne = sc.nextInt();
            System.out.println("Entrez une Colonne ");
            int colonne = sc.nextInt();
            
            if(ligne>=0 && ligne<3 && colonne>=0 && colonne<3){
                coor[0] = ligne;
                coor[1] = colonne;
                correct = true;
            }
        }
        return coor;
    }
    
    public String toStringGrille(){
        
        String str = ""; 
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                str = str + this.grille[i][j] + " ";
            }
            str = str + "\n";
        }
         
         return str + "A toi de jouer !!! Joueur numéro: " + this.numjoueur +"\n";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // test initialistation de grille
        Morpion mp = new Morpion(2);
        // test methode saisiChoix()
        mp.saisiChoix();
        // test methode toStringGrille() sur la grille initialisée
        System.out.print(mp.toStringGrille());
        
        
    }
    
    
    
    
    
    
}
