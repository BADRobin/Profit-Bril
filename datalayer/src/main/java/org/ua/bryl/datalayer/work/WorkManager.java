package org.ua.bryl.datalayer.work;

import org.springframework.stereotype.Repository;
import org.ua.bryl.datalayer.AbstractDAO;
import org.ua.bryl.model.Work;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Repository
public  class WorkManager extends AbstractDAO<Work>   implements WorkDAO {
    @Transactional
    @Override
    public Work create(Work work) {
        return super.create(work);
    }

    @Override
    public List<Work> getAll() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Work get(long id) {
        return this.get(id);
    }

    @Override
    public boolean update(Work work) {
        return true;
    }

    @Override
    public void delete(long id) {

    }
}
