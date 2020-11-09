
package bookstore;


public class Produit {
  
    private int quantity;
    private double unitprice;
    
   
//le constructeur

    public Produit(int quantity, double unitprice) {
        this.quantity = quantity;
        this.unitprice = unitprice;
    }
//le getter pour permettre l'accÃ¨s en lecture Ã  l'attribut (quantity)

    public int getQuantity() {
        return quantity;
    }
//le setter pour permettre le changement d'Ã©tat de l'attribut (quantity)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
//le getter pour permettre l'accÃ¨s en lecture Ã  l'attribut (Unitprice)
    public double getUnitprice() {
        return unitprice;
    }
//le setter pour permettre le changement d'Ã©tat de l'attribut (unitprice)
    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
    //la méthode calculateTotalPrice
    
    public double calculateTotalPrice( int quantity,double unitprice){
       
       return quantity*unitprice;
    }
//L'affichage des données 
    @Override
    public String toString() {
        return  "the quantity is=" + quantity + ", the unitprice is =" + unitprice + "and the total price is" + calculateTotalPrice(quantity, unitprice)  ;
    }
   
   
}
