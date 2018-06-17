package org.ua.bryl.datalayer.review;

import org.springframework.stereotype.Repository;
import org.ua.bryl.datalayer.AbstractDAO;
import org.ua.bryl.model.Review;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;

@Repository
public  class ReviewManager  extends AbstractDAO<Review> implements ReviewDAO {

   @Transactional
   @Override
   public Review create (Review review){
       return super.create(review);
   }


    @Override
    public List<Review> getAll() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public Review get(long id) {
        return this.get(id);
    }

    @Override
    public boolean update(Review review) {
        return true;
    }

    @Override
    public void delete(long id) {

    }
}
