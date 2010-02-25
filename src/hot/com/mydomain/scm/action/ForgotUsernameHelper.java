/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydomain.scm.action;

import com.mydomain.scm.model.Contact;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import org.hibernate.validator.Email;
import org.hibernate.validator.NotNull;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.faces.FacesMessages;
import org.jboss.seam.faces.Renderer;
import org.jboss.seam.international.StatusMessage.Severity;

/**
 *
 * @author khaya
 */
@Name("forgotUsernameHelper")
public class ForgotUsernameHelper {

    @In(create = true)
    private Renderer renderer;
    @In(create = true)
    private EntityManager entityManager;
    @In(create = true)
    private FacesMessages facesMessages;
    private String usernameFound;
    private String email;

    @NotNull
    @Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsernameFound() {
        return usernameFound;
    }

    public void setUsernameFound(String usernameFound) {
        this.usernameFound = usernameFound;
    }

    public void sendUsername() {
        String sql = "select c from Contact c where c.email = :email";
        try {
            Contact contact = (Contact) entityManager.createQuery(sql).setParameter("email", getEmail()).getSingleResult();
            setUsernameFound(contact.getUsername());
            //send email
            renderer.render("/mailTemplates/forgotUsernameMail.xhtml");
            facesMessages.add(Severity.INFO, "#{messages.newUsernameSent}");

            //empty form
            setEmail(null);
            setUsernameFound(null);
        } catch (NoResultException nre) {
            facesMessages.addToControl("email", Severity.INFO, "#{messages.emailNotFound}");
        }
    }
}
