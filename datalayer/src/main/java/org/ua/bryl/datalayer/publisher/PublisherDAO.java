package org.ua.bryl.datalayer.publisher;
import org.springframework.stereotype.Repository;
import org.ua.bryl.model.Publisher;

import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */

public interface PublisherDAO {
    Publisher create(Publisher publisher);

    List<Publisher> getAll();

    Publisher get(long id);

    boolean update(Publisher publisher);

    void delete(long id);
}