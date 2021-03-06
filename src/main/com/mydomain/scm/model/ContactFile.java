package com.mydomain.scm.model;
// Generated 13 Jan 2010 3:10:57 PM by Hibernate Tools 3.2.4.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * ContactFile generated by hbm2java
 */
@Entity
@Table(name = "contact_file", catalog = "advcm_db")
public class ContactFile implements java.io.Serializable {

	private Integer id;
	private Contact contact;
	private String fileName;
	private String fileType;
	private String description;
	private Date createdOn;
	private Date lastUpdatedOn;

	public ContactFile() {
	}

	public ContactFile(Contact contact, String fileName, String fileType,
			Date createdOn, Date lastUpdatedOn) {
		this.contact = contact;
		this.fileName = fileName;
		this.fileType = fileType;
		this.createdOn = createdOn;
		this.lastUpdatedOn = lastUpdatedOn;
	}
	public ContactFile(Contact contact, String fileName, String fileType,
			String description, Date createdOn, Date lastUpdatedOn) {
		this.contact = contact;
		this.fileName = fileName;
		this.fileType = fileType;
		this.description = description;
		this.createdOn = createdOn;
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ContactId", nullable = false)
	@NotNull
	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Column(name = "fileName", nullable = false)
	@NotNull
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "fileType", nullable = false, length = 25)
	@NotNull
	@Length(max = 25)
	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdOn", nullable = false, length = 19)
	@NotNull
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastUpdatedOn", nullable = false, length = 19)
	@NotNull
	public Date getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

}
