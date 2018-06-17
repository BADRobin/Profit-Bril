package org.ua.bryl.datalayer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */
public abstract class AbstractDAO<T> {

    @PersistenceContext
    protected EntityManager em;



    @Transactional
    public T create(T object) {
//        em.getTransaction().begin();
        T objectFromDB = em.merge(object);
//        em.getTransaction().commit();
        return objectFromDB;
    }
   /* @Transactional
    public void delete(long Id) {
//        em.getTransaction().begin();
        em.remove(get(Id));
//        em.getTransaction().commit();
    }*/
    @Transactional
    public boolean update(T b) {
//        em.getTransaction().begin();
        em.merge(b);
//        em.getTransaction().commit();
        return true;
    }

  /*  public T get(long Id) {
        return em.find(type, Id);
    }

    public List<T> getAll() {
        TypedQuery<T> namedQuery = em.createNamedQuery(type.getSimpleName() + ".getAll", type);
        return namedQuery.getResultList();
    }*/
}
