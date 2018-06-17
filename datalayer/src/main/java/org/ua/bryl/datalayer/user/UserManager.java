//package org.ua.bryl.datalayer.user;
//
//import org.springframework.stereotype.Repository;
//import org.ua.bryl.datalayer.AbstractDAO;
//import org.ua.bryl.model.MyUser;
//
//import javax.transaction.Transactional;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//
//@Repository
//public abstract class UserManager extends AbstractDAO<MyUser>  implements UserDAO {
//
//    @Transactional
//    @Override
//    public MyUser create(MyUser user) {
//        return super.create(user);
//    }
//
//    @Override
//    public List<MyUser> getAll() {
//        return Collections.EMPTY_LIST;
//    }
//
//    @Override
//    public MyUser get(long id) {
//        return this.get(id);
//    }
//
//    @Override
//    public boolean update(MyUser user) {
//        return true;
//    }
//
//    @Override
//    public void delete(long id) {
//
//    }
//}
