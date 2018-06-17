package org.ua.bryl.datalayer.book;

import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.ua.bryl.datalayer.AbstractDAO;
import org.ua.bryl.model.Book;
import java.util.Collections;
import java.util.List;
import javax.transaction.Transactional;
/**
 * Created by Sweet on 05.03.2017.
 */
@Repository
public class BookDaoImpl extends AbstractDAO<Book> implements BookDAO{
    @Transactional
    @Override
    public Book create(Book book) {
        return super.create(book);

    }



    @Override
    public List<Book> getAll() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Book get(long id) {
        return this.get(id);
    }

    @Override
    public boolean update(Book book) {
        return true;
    }

    @Override
    public void delete(long id) {

    }
}
