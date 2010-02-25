/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mydomain.scm.action;

import com.mydomain.scm.model.Contact;
import com.mydomain.scm.model.ContactField;
import java.util.List;
import javax.persistence.EntityManager;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.jboss.seam.faces.FacesMessages;

/**
 *
 * @author khaya
 */
@Name("homeSelectedContactOtherFieldsHelper")
@Scope(ScopeType.CONVERSATION)
public class HomeSelectedContactOtherFieldsHelper {

    @In(create = true)
    EntityManager entityManager;
    @In(required = true)
    Contact loggedUser;
    @In
    FacesMessages facesMessages;
    @In(required = true)
    HomeSelectedContactHelper homeSelectedContactHelper;
    private List<ContactField> contactFieldsList;

    public List<ContactField> getContactFieldsList() {
    if (contactFieldsList == null) {
            // Getting the list of all the contact fields
            String query = "from ContactField cf where cf.contact.id=:idContactOwner order by cf.id";
            contactFieldsList = (List<ContactField>) entityManager.createQuery(query)
                    .setParameter("idContactOwner", homeSelectedContactHelper.getSelectedContact().getId())
                    .getResultList();
        }
        return contactFieldsList;
    }

    public void setContactFieldsList(List<ContactField> contactFieldsList) {
        this.contactFieldsList = contactFieldsList;
    }

    public void createNewContactFieldInstance() {
        // Adding the new instance as last field (for inserting a new field)
        getContactFieldsList().add(new ContactField());
    }

    public void persistNewContactField(ContactField contactField) {
        //attaching the owner of the field
        contactField.setContact(homeSelectedContactHelper.getSelectedContact());
        entityManager.persist(contactField);

    }

    public void deleteContactField(ContactField contactField) {
        // if its in the database delete it
        if (isContactFieldManaged(contactField)) {
            entityManager.remove(contactField);
        }
        //removing the field from the list
        getContactFieldsList().remove(contactField);

    }

    public boolean isContactFieldManaged(ContactField contactField) {
        return contactField != null && entityManager.contains(contactField);
    }
}
