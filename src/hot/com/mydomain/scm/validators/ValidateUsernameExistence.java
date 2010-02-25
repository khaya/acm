/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydomain.scm.validators;

import com.mydomain.scm.model.Contact;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import org.jboss.seam.Component;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.faces.Validator;
import org.jboss.seam.annotations.intercept.BypassInterceptors;
import org.jboss.seam.faces.FacesMessages;

/**
 *
 * @author khaya
 */
@BypassInterceptors
@Validator
@Name("usernameExistenceValidator")
public class ValidateUsernameExistence implements javax.faces.validator.Validator {

    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        boolean usernameExists = usernameExists((String) o);
        if(usernameExists){
            throw new ValidatorException(FacesMessages.createFacesMessage(FacesMessage.SEVERITY_ERROR, "com.mydomain.validator.usernameExistenceValidator","#{messages.javax.faces.component.UIInput.REQUIRED}", o));
        }

    }

    private boolean usernameExists(String username) {
        EntityManager entityManager = (EntityManager) Component.getInstance("entityManager");
        if (username != null) {
            String sql = "select c from Contact c where c.username = :username";
            try {
                List<Contact> usernames = entityManager.createQuery(sql).setParameter("username", username).getResultList();
                if (usernames.size() > 0) {
                    return true;
                } else {
                    return false;
                }
            } catch (NoResultException nre) {
                //not found
                return false;
            }

        }
        return false;
    }
}
