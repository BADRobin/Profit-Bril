package org.ua.bryl.datalayer.work;
import org.springframework.stereotype.Repository;
import org.ua.bryl.model.Work;

import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */

public interface WorkDAO {
    Work create(Work work);

    List<Work> getAll();

    Work get(long id);

    boolean update(Work work);

    void delete(long id);
}