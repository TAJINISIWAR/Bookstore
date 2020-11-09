
package bookstore;
import java.util.Scanner;


public class Main {
    
    
     public static void main(String[] args) {
      
       Scanner clavier = new Scanner(System.in);
     
       //le fait de donner la quantité du produit et l'afficher

       System.out.println("the quatity is");
       int quantity =clavier.nextInt();
       
       
       //le fait de donner l'unité du prix du produit et l'afficher

       System.out.println("the unit price is:");
       double unitprice =clavier.nextDouble();
    

       //le fait d'instancier un objet produit_a_acheter du type Produit
       
       Produit produit_a_acheter =new Produit(quantity,unitprice);
       ;
      
       
       //le fait de calculer le prix total pour ce produit en faisant appel à  la methode calculateTotalPrice()

       System.out.println("the total price is :" + produit_a_acheter.calculateTotalPrice(quantity,unitprice) + "TDN");
               
       
       
        }
   
}
