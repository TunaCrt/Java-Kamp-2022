import oppWithNLayaredApp.business.ProductManager;
import oppWithNLayaredApp.core.loging.DataBaseLogger;
import oppWithNLayaredApp.core.loging.FileLogger;
import oppWithNLayaredApp.core.loging.Logger;
import oppWithNLayaredApp.core.loging.MailLogger;
import oppWithNLayaredApp.dataAccess.ProductDao;
import oppWithNLayaredApp.dataAccess.jdbcProductDao;
import oppWithNLayaredApp.entities.Product;

public class Main {

    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "telefon", 1350);

        Logger[] loggers = {new FileLogger(), new MailLogger(), new DataBaseLogger()};

        ProductManager productManager = new ProductManager(new jdbcProductDao(), loggers);
        productManager.add(product1);


    }
}
