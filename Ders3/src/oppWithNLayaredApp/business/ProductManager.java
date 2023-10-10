package oppWithNLayaredApp.business;

import oppWithNLayaredApp.core.loging.Logger;
import oppWithNLayaredApp.dataAccess.ProductDao;
import oppWithNLayaredApp.dataAccess.jdbcProductDao;
import oppWithNLayaredApp.entities.Product;

import java.util.List;

public class ProductManager {//response request olarak tekrar elden geçicek
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {//dependency injection denir buna
        /*productManager newlendiğinde bana
         productDaou(jdbc veya Hibernate olabilir) ve loggers(MailLogger ya da hergangibiri olabilir) ver */
        this.productDao = productDao;
        this.loggers = loggers;
    }


    public void add(Product product) throws Exception {//iş kuralları
        if (product.getUnıtPrice() < 10) {
            throw new Exception("ürün fiyatı 10'dan küçük olamaz");
        }
        //jdbcProductDao ProductDao=new jdbcProductDao();  işlevsel olmayan yöntem(jdbc'ye bağımlı oluruz bu şekilde)
        //ProductDao ProductDao=new jdbcProductDao();
        productDao.add(product);
        for (Logger logger : loggers) {
            logger.log(product.getName());

        }

    }
}
