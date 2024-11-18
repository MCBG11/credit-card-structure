import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<Products> shoppingList;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shoppingList = new ArrayList<>();
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Products> getShoppingList() {
        return shoppingList;
    }

    public boolean placeOrder(Products product){
        if (this.balance >= product.getPrice()) {
            this.balance -= product.getPrice();
            this.shoppingList.add(product);
            return true;
        }
        return false;
        }


}

