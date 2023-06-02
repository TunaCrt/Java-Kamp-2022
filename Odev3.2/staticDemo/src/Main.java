public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.id = 1;
        product.name ="Mouse";
        product.price = 10;

        productManager.add(product);

        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnection();
    }
}