package ClassesWithAttribute;

public class Main {
    public static void main(String[] args) {
        //        Product product = new Product();
//        product.name = "Asus Notebook";
//        product.id = 1;
//        product.description = "Oyun BilgisayarÄ±";
//        product.stockAmount = 30;
//        product.price = 10000;
        Product product = new Product(1,"laptop","Oyun bilgisayarÄ±",4000,10,"mavi");
        product.setDescription("Oyun BilgisayarÄ±");
        product.setPrice(4000);
        product.setName("Asus Notebook");
        product.setStockAmount(10);
        product.setId(1);
        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
