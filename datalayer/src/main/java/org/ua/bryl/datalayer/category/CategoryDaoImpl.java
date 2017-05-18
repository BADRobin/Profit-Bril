package org.ua.bryl.datalayer.category;

import org.springframework.stereotype.Repository;
import org.ua.bryl.datalayer.AbstractDAO;
import org.ua.bryl.model.Book;
import org.ua.bryl.model.Category;

import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */
@Repository
public class CategoryDaoImpl extends AbstractDAO<Category> implements CategoryDAO{
    public CategoryDaoImpl(Class<Category> type) {
        super(type);
    }
    @Override
    public Category createCategory() {
        return new Category();
    }

    @Override
    public List<Category> getAllCategorys() {
        return null;
    }

    @Override
    public Category getCategory(int codeNo) {
        return null;
    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    public void deleteCategory(Category category) {

    }
}
