/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydomain.scm.action;

import com.mydomain.scm.model.Contact;
import com.mydomain.scm.utils.PasswordUtils;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
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
@Name("resetPasswordHelper")
public class ResetPasswordHelper {

    @In(create = true)
    Renderer renderer;
    @In(create = true)
    EntityManager entityManager;
    @In
    FacesMessages facesMessages;
    String newPassword;
    String username;
    String email;
    boolean reset;

    public void reset() {
        try {
            String sql = "select c from Contact c where c.username = :username ";
            Contact actor = (Contact) entityManager.createQuery(sql).setParameter("username", getUsername()).getSingleResult();
            //setting the new password
            setEmail(actor.getEmail());
            setNewPassword(PasswordUtils.getRandomPassword());
            //updating it
            actor.setPassword(getNewPassword());

            //saving the new password
            entityManager.merge(actor);

            //send email
            renderer.render("/mailTemplates/resetPasswordMail.xhtml");

            //set message
            facesMessages.add(Severity.INFO,"#{messages.newPasswordSent}");

            //empty the form
            setNewPassword(null);
            setUsername(null);
            setEmail(null);
            setReset(true);
        } catch (NoResultException nre) {
            facesMessages.addToControl("username",Severity.INFO,"#{messages.usernameNotFound}");

        }
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @NotNull
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isReset() {
        return reset;
    }

    public void setReset(boolean reset) {
        this.reset = reset;
    }

}
