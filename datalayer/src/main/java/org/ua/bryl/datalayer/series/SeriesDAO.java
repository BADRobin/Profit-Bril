package org.ua.bryl.datalayer.series;
import org.springframework.stereotype.Repository;
import org.ua.bryl.model.Series;

import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */

public interface SeriesDAO {
    Series create(Series series);

    List<Series> getAll();

    Series get(long id);

    boolean update(Series series);

    void delete(long id);
}