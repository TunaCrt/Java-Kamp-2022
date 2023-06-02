package Kodlamaİo.dataAccess.Jdbc;

import Kodlamaİo.dataAccess.CategoryDao;
import Kodlamaİo.entities.Category;

public class CategoryJdbcDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Katagori JDBC ile veritabanına eklendi");
    }
}
