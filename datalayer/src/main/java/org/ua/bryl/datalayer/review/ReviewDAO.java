package org.ua.bryl.datalayer.review;
import org.springframework.stereotype.Repository;
import org.ua.bryl.model.Review;

import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */

public interface ReviewDAO {
    Review create(Review review);

    List<Review> getAll();

    Review get(long id);

    boolean update(Review review);

    void delete(long id);
}