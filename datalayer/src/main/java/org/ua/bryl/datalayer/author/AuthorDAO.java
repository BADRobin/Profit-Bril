package org.ua.bryl.datalayer.author;
import org.ua.bryl.model.Author;

import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */public interface AuthorDAO {
     Author create (Author author);
     List<Author> getAll();
     Author get(long id);
     boolean update (Author author);
     void delete(long id );





}