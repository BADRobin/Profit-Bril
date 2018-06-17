package org.ua.bryl.datalayer.category;
import org.springframework.stereotype.Repository;
import org.ua.bryl.datalayer.AbstractDAO;
import org.ua.bryl.model.Category;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */
@Repository
public class CategoryDaoImpl extends AbstractDAO<Category> implements CategoryDAO{


    @Transactional
    @Override
    public Category create(Category category) {
        return super.create(category);

    }


    @Override
    public List<Category> getAll() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Category get(long id) {
        return this.get(id);
    }

    @Override
    public boolean update(Category category) {
        return true;
    }

    @Override
    public void delete(long id) {

    }
}
