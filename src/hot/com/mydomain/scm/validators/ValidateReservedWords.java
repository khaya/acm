/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydomain.scm.validators;

import com.mydomain.scm.options.AppOptions;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import org.jboss.seam.Component;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.faces.Validator;
import org.jboss.seam.annotations.intercept.BypassInterceptors;
import org.jboss.seam.faces.FacesMessages;

/**
 *
 * @author khaya
 */
@Name("reservedWordsValidator")
@BypassInterceptors
@Validator
public class ValidateReservedWords implements javax.faces.validator.Validator {

    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        AppOptions appOptions = (AppOptions) Component.getInstance("appOptions");
        boolean valid = isReservedWord(appOptions.getReservedWords(), (String) o);
        if (!valid) {
            throw new ValidatorException(FacesMessages.createFacesMessage(FacesMessage.SEVERITY_ERROR, "com.mydomain.validator.reservedWordsValidator", "#{messages.javax.faces.component.UIInput.REQUIRED}", o));
        }
    }

    private boolean isReservedWord(List<String> reservedWords, String word) {
        for (String reservedWord : reservedWords) {
            if (word.compareToIgnoreCase(reservedWord) == 0) {
                return false;
            }
        }
        return true;
    }
}
