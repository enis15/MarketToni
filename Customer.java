package MarketTOni;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int CustomerID;
    private ArrayList<Product> basket;

    public Customer(String name, int customerID) throws MarketException {
        if (name == null || name.trim().isEmpty()) throw new MarketException("Not null name required!");
        if (customerID < 0) throw new MarketException("Not negative value of customer ID required");
        this.name = name;
        CustomerID = customerID;
        basket = new ArrayList<>();
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Product> basket) {
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws MarketException {
        if (name == null || name.trim().isEmpty()) throw new MarketException("Not null name required!");
        this.name = name;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    @Override
    public String toString() {
        return name + " - "+getCustomerID();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void buyProduct(Product product) throws MarketException {
        if (product == null) throw new MarketException("Not null variable required");
        basket.add(product);
        product.setAmount(product.getAmount()-1);
    }

    public void buyProduct(int barcode,int amount) throws MarketException {
        if (barcode < 0 ) throw new MarketException("ProductID not negative required ");
        Product theOneNeeded = null;
        for (int i = 0; i < Market.products.size(); i++) {
            if (Market.products.get(i).getBarcode() == barcode){
                theOneNeeded = Market.products.get(i);
            }
        }
        basket.add(theOneNeeded);
        theOneNeeded.setAmount(theOneNeeded.getAmount()-amount);
    }

    public boolean equals(Customer customer){
        if (customer instanceof Customer)
            return ((Customer)customer).getCustomerID() == getCustomerID();
        return false;
    }

}
