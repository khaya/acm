/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydomain.scm.action;

import com.mydomain.scm.model.Contact;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.captcha.Captcha;
import org.jboss.seam.faces.FacesMessages;
import org.jboss.seam.faces.Renderer;
import org.jboss.seam.international.StatusMessage.Severity;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;

/**
 *
 * @author khaya
 */
@Name("registrationHelper")
public class RegistrationHelper {

    @In(create = true)
    EntityManager entityManager;
    @In
    FacesMessages facesMessages;
    @In(create = true)
    Captcha captcha;
    @In
    Credentials credentials;
    @In
    Identity identity;

    @In(create=true)
    Renderer  renderer;
    private Contact newUser;

    public void signUp() {
        try {
            entityManager.persist(getNewUser());
            facesMessages.add(Severity.INFO, "#{messages.userRegisteredThanks}");
            // Empty the captcha
            Captcha.instance().setResponse(null);
            Captcha.instance().init();
            
            //Execute the login
            credentials.setUsername(getNewUser().getUsername());
            credentials.setPassword(getNewUser().getPassword());
            identity.login();
//            renderer.render("/mailTemplates/newRegistrationForUser.xhtml");
        } catch (NoResultException nre) {
            facesMessages.add(Severity.ERROR, "#{messages.emailNotFound}");
        }
    }

    public Contact getNewUser() {
        if (newUser == null) {
            newUser = new Contact();
            newUser.setActive(true);
        }
        return newUser;
    }

    public void setNewUser(Contact newUser) {
        this.newUser = newUser;
    }
}
