package MarketTOni;

public class Product {
    private long barcode;
    private String name;
    private double price;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product(String name, long barcode, double price,int amount) throws MarketException {
        if (name == null || name.trim().isEmpty())
            throw new MarketException("Name can t be null!");
        if (barcode < 0 )
            throw new MarketException("U should not use negative values for barcode");
        if (price < 0)
            throw new MarketException("U should not use prices as negative values");
        if (amount < 0)
            throw new MarketException("AMount should not be negative");
        this.amount = amount;
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setName(String name) throws MarketException {
        if (name == null || name.trim().isEmpty()) throw new MarketException("Name can t be null!");
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return barcode+" - "+name+" - "+price;
    }

    public void setPrice(double price) throws MarketException {
        if (price < 0) throw new MarketException("U should not use prices as negative values");
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product)
            return ((Product)obj).barcode == barcode;
        return false;
    }
}
