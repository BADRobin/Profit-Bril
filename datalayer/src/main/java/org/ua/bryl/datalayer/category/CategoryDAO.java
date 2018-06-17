package org.ua.bryl.datalayer.category;
import org.ua.bryl.model.Category;

import java.util.List;
/**
 * Created by Sweet on 05.03.2017.
 */
public interface CategoryDAO {
     Category create (Category category);
     List<Category> getAll();
     Category get(long id);
     boolean update(Category category);
     void delete(long id);
}
