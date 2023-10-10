package oppWithNLayaredApp.dataAccess;

import oppWithNLayaredApp.entities.Product;

public class jdbcProductDao implements ProductDao {
    public void add(Product product) {
        //buraya sadece db kodları yazılır (SQL)
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
