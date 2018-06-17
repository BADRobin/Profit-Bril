package org.ua.bryl.datalayer.isbn;

import org.ua.bryl.model.Isbn;

import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */
public interface IsbnDAO {
    Isbn create (Isbn Isbn);

    List<Isbn> getAll();
    Isbn get(long id);
    boolean update (Isbn author);
    void delete(long id );
}
