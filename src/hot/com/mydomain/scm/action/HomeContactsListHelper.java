/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydomain.scm.action;

import com.mydomain.scm.model.Contact;
import java.util.List;
import javax.persistence.EntityManager;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.log.Log;

/**
 *
 * @author khaya
 */
@Name("homeContactsListHelper")
public class HomeContactsListHelper {

    @Logger
    Log log;

    @In(create = true)
    EntityManager entityManager;
    @In(required = true)
    Contact loggedUser;
    List<Contact> contactsList;

    public List<Contact> getContactsList() {
        if (contactsList == null) {
            log.info("retrieving contacts  list");
            String sql = "select c from Contact c where c.contact.id = :fatherId";
            contactsList = (List<Contact>) entityManager.createQuery(sql).setParameter("fatherId", loggedUser.getId()).getResultList();
        }
        return contactsList;
    }

    public void setContactsList(List<Contact> contactsList) {
        this.contactsList = contactsList;
    }
}
