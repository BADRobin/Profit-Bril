package org.ua.bryl.datalayer.Security;

/**
 * Created by Sweet on 25.06.2017.
 */
public interface SecuritService {
    String findLoggedInUsername ();

    void autoLogin(String username, String password);
}
