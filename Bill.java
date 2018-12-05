package MarketTOni;


public class Bill {
    private int numberOfTotalBill;
    private double totalCost;

    public Bill(){
        numberOfTotalBill = 0;
        totalCost = 0;
    }

    public String bill (int customerID){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Market.customers.size(); i++) {
            Customer customer = Market.customers.get(i);
            if (customer.getCustomerID() == customerID){
                sb.append("\nName :   "+customer.getName()+",     ID : "+customerID+"\n");
                sb.append("-------------------------------------------------------------------\n");
                sb.append("Product");
                sb.append(String.format("%"+12+"s","Barcode"));
                sb.append(String.format("%"+12+"s","Quantity"));
                sb.append(String.format("%"+12+"s","Price\n"));
                for (int j = 0; j < customer.getBasket().size(); j++) {
                    Product product = customer.getBasket().get(j);
                    sb.append(String.format("%6d\t%s\t\t%d\t\t\t\t%d%n", product.getBarcode(), product.getName(), product.getAmount(),(int) product.getPrice()));
                    totalCost += product.getPrice();
                }
                sb.append("\n-------------------------------------------------------------------\n");
                sb.append("Total Cost : "+totalCost);
            }
        }
        return sb.toString();
    }
}
