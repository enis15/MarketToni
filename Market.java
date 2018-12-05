package MarketTOni;

import java.util.ArrayList;

public class Market {
    static ArrayList<Customer> customers;
    static ArrayList<Product> products;
    private String marketName;

    public Market(String marketName,int nrCustomers,int nrProducts) throws MarketException {
        if (marketName == null || marketName.trim().isEmpty()) throw new MarketException("Not null marketname is required");
        if (nrCustomers < 0) throw new MarketException("Negative numbers not allowed at number of customers");
        if (nrProducts < 0 ) throw new MarketException("Negative numbers not allowed at number of products");
        customers = new ArrayList<>(nrCustomers);
        products = new ArrayList<>(nrProducts);
        this.marketName = marketName;
    }

    public void addProducts(Product product){
        Market.products.add(product);
    }

    public void addCustomer(Customer customer){
        Market.customers.add(customer);
    }

    public void setMarketName(String marketName) throws MarketException {
        if (marketName == null) throw new MarketException("Not null market name is required ");
        this.marketName = marketName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getMarketName() {
        return marketName;
    }
}
