package org.ua.bryl.datalayer.isbn;

import org.springframework.stereotype.Repository;
import org.ua.bryl.datalayer.AbstractDAO;
import org.ua.bryl.model.Isbn;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
/**
 * Created by Sweet on 29.04.2017.
 */
@Repository
public class IsbnDaoimpl extends AbstractDAO<Isbn> implements IsbnDAO {

    @Transactional
    @Override
    public Isbn create(Isbn isbn) {
        return super.create(isbn);

    }
    @Override
    public List<Isbn> getAll() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Isbn get(long id) {
        return this.get(id);
    }
    @Override
    public boolean update(Isbn isbn) {

        return true;
    }

    @Override
    public void delete(long id) {

    }
}
