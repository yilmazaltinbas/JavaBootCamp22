package odev3.dataAccess;

import odev3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile Category veritabanına eklendi");
    }
}
