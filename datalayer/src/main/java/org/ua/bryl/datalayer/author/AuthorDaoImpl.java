package org.ua.bryl.datalayer.author;
import org.springframework.stereotype.Repository;
import org.ua.bryl.datalayer.AbstractDAO;
import org.ua.bryl.model.Author;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Repository
public class AuthorDaoImpl extends AbstractDAO<Author> implements AuthorDAO {

    @Transactional
    @Override
    public Author create(Author author) {
        return super.create(author);

    }

    @Override
    public List<Author> getAll() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Author get(long id) {
        return this.get(id);
    }

    @Override
    public boolean update(Author author) {

        return true;
    }

    @Override
    public void delete(long id) {

    }


}
