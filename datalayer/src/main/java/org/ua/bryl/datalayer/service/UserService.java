package org.ua.bryl.datalayer.service;

import org.ua.bryl.model.User;

/**
 * Created by Sweet on 25.06.2017.
 */
public interface UserService {
    void save (User user);
    User findByUsername (String username);
}
