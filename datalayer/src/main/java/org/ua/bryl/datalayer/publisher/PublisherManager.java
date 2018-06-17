package org.ua.bryl.datalayer.publisher;
import org.springframework.stereotype.Repository;
import org.ua.bryl.datalayer.AbstractDAO;
import org.ua.bryl.model.Publisher;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Repository
public  class PublisherManager extends AbstractDAO<Publisher>  implements PublisherDAO {

    @Transactional
    @Override
    public Publisher create (Publisher publisher) {
        return super.create(publisher);
    }

    @Override
    public List<Publisher> getAll() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Publisher get(long id) {
        return this.get(id);
    }

    @Override
    public boolean update(Publisher publisher) {
        return true;
    }

    @Override
    public void delete(long id) {

    }
}
