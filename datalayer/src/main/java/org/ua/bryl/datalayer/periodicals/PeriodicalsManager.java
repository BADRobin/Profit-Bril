package org.ua.bryl.datalayer.periodicals;
import org.springframework.stereotype.Repository;
import org.ua.bryl.datalayer.AbstractDAO;

import org.ua.bryl.model.Periodicals;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Repository
public  class PeriodicalsManager extends AbstractDAO<Periodicals>  implements PeriodicalsDAO {

    @Transactional
    @Override
    public Periodicals create(Periodicals periodicals) {
        return super.create(periodicals);

    }

    @Override
    public List<Periodicals> getAll() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Periodicals get(long id) {
        return this.get(id);
    }

    @Override
    public boolean update(Periodicals periodicals) {
        return true;
    }

    @Override
    public void delete(long id) {

    }
}
