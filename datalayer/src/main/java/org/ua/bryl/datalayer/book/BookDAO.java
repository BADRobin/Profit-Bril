package org.ua.bryl.datalayer.book;
import org.springframework.validation.annotation.Validated;
import org.ua.bryl.model.Book;

import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */
public interface BookDAO {
     Book create (Book book);
     List<Book> getAll();
     Book get(long id);
     boolean update(Book book);
     void delete(long id);



}