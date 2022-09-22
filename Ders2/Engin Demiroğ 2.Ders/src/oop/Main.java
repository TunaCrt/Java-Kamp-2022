package oop;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";
        Product product1 = new Product();
        //sett value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitPrice(3);
        product1.setImageUrl("123.jpg");
        //get
        System.out.println(product1.getName());


        Product product2 = new Product();
        product2.setName("smeg Kahve Makinesi1");
        product2.setUnitPrice(6500);
        product2.setDiscount(7);
        product2.setUnitPrice(3);
        product2.setImageUrl("123.jpg");


        System.out.println("<ul>");
        Product[] products={product1,product2};
        for (Product product:products){
            System.out.println("<li>"+product.getName()+"</li>");
        }
        System.out.println("</ul>");


        IndividualCustomer individualCustomer=new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("1");
        individualCustomer.setCustomerNumber("1");
        individualCustomer.setFirtName("Tuna");
        individualCustomer.setLastName("Cört");


        CorporateCustomer corporateCustomer=new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("2");
        corporateCustomer.setCustomerNumber("2");
        corporateCustomer.setCompanyName("Tuna");
        corporateCustomer.setTaxNumber("2");



    }


}
