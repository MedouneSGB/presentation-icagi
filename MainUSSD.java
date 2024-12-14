import java.util.Scanner;

public class MainUSSD {
    
    static int solde = 20000;
  
    public static void main(String[] args) {
        
        System.out.println("################################");
        System.out.println("Bienvenu veullez choisir une oparation");
        System.out.println("1. Solde");
        System.out.println("2. Transfer");
        System.out.println("3. Paiment");
        System.out.println("0. Quitter"); 
        System.out.println("################################");
        System.out.print("Choisissez un nombre : ");
        
        Scanner clavier = new Scanner(System.in);
        int choix = clavier.nextInt();
        
        while (choix != 0) {            
        if(choix != 1 && choix != 2 && choix != 3){
            System.out.println("Erreur de choix");
        }else if(choix == 1){
            solde();
        }else if(choix == 2){
            transfert();
        }else{
            paiement();
        }
        
        System.out.println("################################");
        System.out.println("Veullez choisir une oparation");
        System.out.println("1. Solde");
        System.out.println("2. Transfer");
        System.out.println("3. Paiment");
        System.out.println("0. Quitter");
        System.out.println("################################");
        System.out.print("Choisissez un nombre : ");
        
        choix = clavier.nextInt();
        }
      
        System.out.println("A bientot !");
        System.out.println("################################");
    }
    
    public static void solde(){
        System.out.println("Votre solde est de : " + solde);
    }
    public static void transfert(){
        System.out.println("Vous allez faire un transfert ");
    }
    public static void paiement(){
        System.out.println("Vous allez faire un paiement ");
    }
    
}
