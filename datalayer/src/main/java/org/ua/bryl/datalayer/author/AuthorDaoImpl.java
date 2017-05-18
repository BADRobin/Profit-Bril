package org.ua.bryl.datalayer.author;

import org.springframework.stereotype.Repository;
import org.ua.bryl.datalayer.AbstractDAO;
import org.ua.bryl.model.Author;

import java.util.List;

@Repository
public  class AuthorDaoImpl extends AbstractDAO<Author>  implements AuthorDAO {
    public AuthorDaoImpl(Class<Author> type) {
        super(type);
    }

    public Author createAuthor() {
        return new Author ();
    }

    @Override
    public List<Author> getAllAuthors() {
        return null;
    }

    @Override
    public Author getAuthors(int codeNo) {
        return null;
    }

    @Override
    public void updateAuthor(Author author) {

    }

    @Override
    public void deleteAuthor(Author author) {

    }


}
