package org.ua.bryl.datalayer.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ua.bryl.model.MyUser;
import org.ua.bryl.model.User;

import java.util.List;

/**
 * Created by Sweet on 05.03.2017.
 */

public interface UserDAO extends JpaRepository<User, Long> {
   User findByUsername(String username);
//    MyUser create(MyUser user);
//
//    List<MyUser> getAll();
//
//    MyUser get(long id);
//
//    boolean update(MyUser user);
//
//    void delete(long id);
}