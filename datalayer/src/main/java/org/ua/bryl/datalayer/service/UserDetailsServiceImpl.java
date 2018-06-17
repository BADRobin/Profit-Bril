package org.ua.bryl.datalayer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import org.ua.bryl.datalayer.user.UserDAO;
import org.ua.bryl.model.Role;
import org.ua.bryl.model.User;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sweet on 25.06.2017.
 */
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDAO.findByUsername(username);

        Set<GrantedAuthority> grantedAuthorities = new HashSet();
        for (Role role:user.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),grantedAuthorities);
    }
}
