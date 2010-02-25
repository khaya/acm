/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydomain.scm.action;

import com.mydomain.scm.model.Contact;
import javax.persistence.EntityManager;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.faces.FacesMessages;
import org.jboss.seam.international.StatusMessage.Severity;

/**
 *
 * @author khaya
 */
@Name("homeSelectedContactHelper")
@Scope(ScopeType.CONVERSATION)
public class HomeSelectedContactHelper {

    @In(create = true)
    private EntityManager entityManager;
    @In(required = true)
    private Contact loggedUser;
    @In
    private FacesMessages facesMessages;
    private Contact selectedContact;
    private Boolean selectedContactEditing;

    public Contact getSelectedContact() {
        return selectedContact;
    }

    public void setSelectedContact(Contact selectedContact) {
        this.selectedContact = selectedContact;
    }

    public Boolean getSelectedContactEditing() {
        return selectedContactEditing;
    }

    public void setSelectedContactEditing(Boolean selectedContactEditing) {
        this.selectedContactEditing = selectedContactEditing;
    }

    public void createNewEmptyContactInstance() {
        setSelectedContact(new Contact());
    }

    public void insertNewContact() {
        getSelectedContact().setContact(loggedUser);
        entityManager.persist(getSelectedContact());
        facesMessages.addFromResourceBundle(Severity.INFO, "contactAdded");
    }

    public void saveContactData() {
        entityManager.merge(getSelectedContact());
        facesMessages.addFromResourceBundle(Severity.INFO, "contactSaved");
    }

    public void deleteSelectedContact(){
        entityManager.remove(getSelectedContact());
        setSelectedContact(null);
        setSelectedContactEditing(null);
        facesMessages.addFromResourceBundle(Severity.INFO, "contactDeleted");
    }

    public boolean  isSelectedContactManaged(){
        return getSelectedContact() != null && entityManager.contains(getSelectedContact());
    }
}
