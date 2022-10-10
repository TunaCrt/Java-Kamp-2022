package oppWithNLayaredApp.business;

import oppWithNLayaredApp.core.loging.Logger;
import oppWithNLayaredApp.dataAccess.ProductDao;
import oppWithNLayaredApp.dataAccess.jdbcProductDao;
import oppWithNLayaredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }



    public void add(Product product) throws Exception {//iş kuralları
        if (product.getUnıtPrice()<10){
            throw new Exception("ürün fiyatı 10'dan küçük olamaz");
        }
        //ProductDao ProductDao=new jdbcProductDao();
        productDao.add(product);
        for (Logger logger:loggers) {
            logger.log(product.getName());

        }

    }
}
