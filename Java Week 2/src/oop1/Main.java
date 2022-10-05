package oop1;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
        product1.setName("Makina");
        product1.setUnitPrice(4000);
        product1.setImageUrl("asdasdas.jpg");
        product1.setDiscount(7);
        product1.setUnitsInStock(200);

        Product product2 = new Product();
        product2.setName("Makina");
        product2.setUnitPrice(4000);
        product2.setImageUrl("asdasdas.jpg");
        product2.setDiscount(7);
        product2.setUnitsInStock(200);

        Product product3 = new Product();
        product3.setName("Makina");
        product3.setUnitPrice(4000);
        product3.setImageUrl("asdasdas.jpg");
        product3.setDiscount(7);
        product3.setUnitsInStock(200);



        System.out.println(product1.getName());

        Product [] products = {product1,product2,product3};

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05555555555");
        individualCustomer.setCustomerNumber("123456676");
        individualCustomer.setFirstName("Yılmaz");
        individualCustomer.setLastName("Altınbaş");

        CorporateCustomer corporateCustomer = new CorporateCustomer();

        corporateCustomer.setId(2);
        corporateCustomer.setPhone("0555555555555");
        corporateCustomer.setCompanyName("Yilmaz.goldhead");
        corporateCustomer.setTaxNumber("26662226662");


        Customer[] customers = {individualCustomer,corporateCustomer};




    }
}
