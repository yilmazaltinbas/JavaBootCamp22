package odev3.business;

import odev3.dataAccess.CategoryDao;
import odev3.entities.Category;
import oopWithNLayeredApp.core.logging.Logger;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }


    public void add(Category category) throws Exception{

        Category[] categories = {new Category(1,"Web Programlama"), new Category(2,"Mobil Programlama"),
        new Category(3,"Oyun Programlama"), new Category(4,"Veritabanı Programlama")};

        for(Category category5 : categories){
            if(category.getName() == category5.getName()){
                throw new Exception("Kategori ismi tekrar edemez");
            }
        }

        categoryDao.add(category);
        for(Logger logger:loggers){
            logger.log(category.getName());
        }

    }

}
