package Kodlamaİo.business;

import Kodlamaİo.core.loging.Logger;
import Kodlamaİo.dataAccess.CategoryDao;
import Kodlamaİo.dataAccess.CoruseDao;
import Kodlamaİo.entities.Category;
import Kodlamaİo.entities.Coruse;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;

    private Logger[] loggers;
    private List<Category> categories = new ArrayList<Category>();


    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for (Category category1 : categories) {
            if (category1.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception(
                        "Girdiğiniz kategori adýnda bir kategori mevcut.Lütfen farklı bir kategori giriniz");
            }
        }
        categories.add(category);
        categoryDao.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }

    }


}
