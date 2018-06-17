package org.ua.bryl.datalayer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.ua.bryl.datalayer.user.RoleDAO;
import org.ua.bryl.datalayer.user.UserDAO;
import org.ua.bryl.model.Role;
import org.ua.bryl.model.User;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sweet on 25.06.2017.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private RoleDAO roleDAO;
//    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet();
        roles.add(roleDAO.getOne(1L));
        user.setRoles(roles);
        userDAO.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDAO.findByUsername(username);
    }
}
