package oppWithNLayaredApp.dataAccess;

import oppWithNLayaredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        //buraya sadece db kodları yazılır (SQL)
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
