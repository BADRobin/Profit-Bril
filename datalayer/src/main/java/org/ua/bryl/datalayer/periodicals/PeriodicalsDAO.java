package org.ua.bryl.datalayer.periodicals;
import org.springframework.stereotype.Repository;
import org.ua.bryl.model.Periodicals;

import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */

public interface PeriodicalsDAO {
    Periodicals create (Periodicals periodicals);
    List<Periodicals> getAll();
    Periodicals get(long id);
    boolean update(Periodicals periodicals);
    void delete(long id );



}