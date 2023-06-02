package Kodlamaİo.dataAccess.Hibernate;

import Kodlamaİo.dataAccess.CategoryDao;
import Kodlamaİo.entities.Category;

public class CategoryHibernateDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Katagori"+category.getId()+ " Hibernate ile veritabanına eklendi");
    }
}
