package MarketTOni;

public class Main {
    public static void main(String[] args) {
        try {
            Market marketi = new Market("Viva Store",7,10);
            Customer customer1 = new Customer("Enis Krasniqi",1);
            Customer customer2 = new Customer("Blerton Shabani",3);
            Customer customer3 = new Customer("Fatos Maxhuni",2);
            Customer customer4 = new Customer("Besart Pllana",4);
            Customer customer5 = new Customer("Jeton Krasniqi",5);
            Customer customer6 = new Customer("Agim Zeka",6);
            Customer customer7 = new Customer("Pleurat Breznica",6);

            marketi.addCustomer(customer1);
            marketi.addCustomer(customer2);
            marketi.addCustomer(customer3);
            marketi.addCustomer(customer4);
            marketi.addCustomer(customer5);
            marketi.addCustomer(customer6);
            marketi.addCustomer(customer7);

            marketi.addProducts(new Product("Milka",123112312,2.3,20));
            marketi.addProducts(new Product("Qumesht",111222211,1.0,10));
            marketi.addProducts(new Product("Seven-Days",123112325,0.3,15));
            marketi.addProducts(new Product("Jaffa",123112311,1.5,11));
            marketi.addProducts(new Product("Fanta",123112357,1.4,12));
            marketi.addProducts(new Product("Coca-Cola",123112353,2.0,13));
            marketi.addProducts(new Product("Qante",123112334,20,15));
            marketi.addProducts(new Product("Kepuce",123112398,2.3,14));
            marketi.addProducts(new Product("Xhemper",123112380,11.99,12));
            marketi.addProducts(new Product("Akullore",123112351,0.5,35));


            customer1.buyProduct(123112312,10);
            customer1.buyProduct(123112334,12);
            customer1.buyProduct(123112357,5);
            customer1.buyProduct(123112380,6);
            customer1.buyProduct(111222211,7);

            Bill fatura = new Bill();
            System.out.println(fatura.bill(1));



        } catch (MarketException e) {
            e.printStackTrace();
        }

    }
}
