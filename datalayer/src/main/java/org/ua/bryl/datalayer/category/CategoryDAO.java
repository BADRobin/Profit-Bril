package org.ua.bryl.datalayer.category;
import org.springframework.stereotype.Repository;
import org.ua.bryl.model.Category;

import java.util.List;
/**
 * Created by Sweet on 05.03.2017.
 */
public interface CategoryDAO {
    public Category createCategory ();
    public List<Category> getAllCategorys();
    public Category getCategory(int codeNo);
    public void updateCategory(Category category);
    public void deleteCategory(Category category);
}
