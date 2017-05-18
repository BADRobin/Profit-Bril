package org.ua.bryl.datalayer.author;
import org.springframework.stereotype.Repository;
import org.ua.bryl.model.Author;

import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */

public interface AuthorDAO {
    public Author createAuthor ();
    public List<Author> getAllAuthors();
    public Author getAuthors(int codeNo);
    public void updateAuthor(Author author);
    public void deleteAuthor(Author author);



}