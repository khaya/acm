package com.mydomain.scm.action;

import com.mydomain.scm.model.Contact;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;
import org.jboss.seam.log.Log;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;

@Stateless
@Name("authenticator")
public class AuthenticatorBean implements Authenticator {

    @Logger
    private Log log;
    @In
    Identity identity;
    @In
    Credentials credentials;
    @In(create = true)
    EntityManager entityManager;
    @Out(required = false,scope=ScopeType.SESSION)
    Contact loggedUser;

    public boolean authenticate() {
        log.debug("authenticating {0}", credentials.getUsername());
        try {
            String sql = "select c from Contact c where c.username = :username and c.password = :password and c.active = 1";
            loggedUser = (Contact) entityManager.createQuery(sql).setParameter("username", credentials.getUsername()).setParameter("password", credentials.getPassword()).getSingleResult();
            loggedUser.setLastAccessOn(new Date());
            entityManager.merge(loggedUser);
            return true;
        } catch (NoResultException nre) {
            loggedUser = null;
            return false;
        }


    }
//    public boolean authenticate()
//    {
//        log.info("authenticating {0}", credentials.getUsername());
//        //write your authentication logic here,
//        //return true if the authentication was
//        //successful, false otherwise
//        if ("admin".equals(credentials.getUsername()))
//        {
//            identity.addRole("admin");
//            return true;
//        }
//        return false;
//    }
}
