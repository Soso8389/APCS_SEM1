package pkg;
import java.util.*;

public class ShoppingCartItem {
    private String itemName; 
    private double itemCost;
    private int quantity;
    
    public ShoppingCartItem(){
        this.itemName = "Nothing";
        this.itemCost= 0.00;
        this.quantity=0;
    }
    public ShoppingCartItem(String itemName,double itemCost,int quantity){
        this.itemName=itemName;
        this.itemCost=itemCost;
        this.quantity=quantity;
    }
    public void cartToString(){
        System.out.println("You have "+quantity+" of "+itemName+" for "+" $"+itemCost+" each");
        return;
    }
    public String getItemName(){
        return itemName;
    }
    public double getItemCost(){
        return itemCost;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getTotalCost(){
        double totalCost= itemCost*quantity;
        return totalCost;
    }
    public double getTotalWithTax(){
        double tax = getTotalCost()*0.12;
        return (tax+getTotalCost());
    }
    public double quantityToCostCalculator(int quantity){
     quantity = quantity;
     return (quantity*itemCost);
    }
    
    public boolean compareItemCost(ShoppingCartItem item1){
    
        if (itemCost < item1.itemCost){
            return true;
        }
        else{
            return false;
        }
    }
    public void copyCart(item4){
        item4.itemName = item
    }
}
