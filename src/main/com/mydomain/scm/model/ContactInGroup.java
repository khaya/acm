package com.mydomain.scm.model;
// Generated 13 Jan 2010 3:10:57 PM by Hibernate Tools 3.2.4.GA

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.NotNull;

/**
 * ContactInGroup generated by hbm2java
 */
@Entity
@Table(name = "contact_in_group", catalog = "advcm_db")
public class ContactInGroup implements java.io.Serializable {

	private ContactInGroupId id;
	private ContactGroup contactGroup;
	private Contact contact;
	private Date insertedOn;

	public ContactInGroup() {
	}

	public ContactInGroup(ContactInGroupId id, ContactGroup contactGroup,
			Contact contact, Date insertedOn) {
		this.id = id;
		this.contactGroup = contactGroup;
		this.contact = contact;
		this.insertedOn = insertedOn;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "contactGroup", column = @Column(name = "ContactGroup", nullable = false)),
			@AttributeOverride(name = "contact", column = @Column(name = "Contact", nullable = false))})
	@NotNull
	public ContactInGroupId getId() {
		return this.id;
	}

	public void setId(ContactInGroupId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ContactGroup", nullable = false, insertable = false, updatable = false)
	@NotNull
	public ContactGroup getContactGroup() {
		return this.contactGroup;
	}

	public void setContactGroup(ContactGroup contactGroup) {
		this.contactGroup = contactGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Contact", nullable = false, insertable = false, updatable = false)
	@NotNull
	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "insertedOn", nullable = false, length = 19)
	@NotNull
	public Date getInsertedOn() {
		return this.insertedOn;
	}

	public void setInsertedOn(Date insertedOn) {
		this.insertedOn = insertedOn;
	}

}
