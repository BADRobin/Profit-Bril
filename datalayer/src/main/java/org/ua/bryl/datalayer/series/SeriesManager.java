package org.ua.bryl.datalayer.series;


import org.springframework.stereotype.Repository;
import org.ua.bryl.datalayer.AbstractDAO;
import org.ua.bryl.model.Series;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Repository
public  class SeriesManager extends AbstractDAO<Series>  implements SeriesDAO {
    @Transactional
    @Override
    public Series create(Series series) {
        return super.create(series);
    }

    @Override
    public List<Series> getAll() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Series get(long id) {
        return this.get(id);
    }

    @Override
    public boolean update(Series series) {
        return true;
    }

    @Override
    public void delete(long id) {

    }
}