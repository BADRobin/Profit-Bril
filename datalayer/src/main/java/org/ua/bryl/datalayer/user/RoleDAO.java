package org.ua.bryl.datalayer.user;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ua.bryl.model.Role;

/**
 * Created by Sweet on 25.06.2017.
 */
public interface RoleDAO extends JpaRepository<Role, Long> {
}
