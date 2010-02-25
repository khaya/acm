package com.mydomain.scm.model;
// Generated 13 Jan 2010 3:10:57 PM by Hibernate Tools 3.2.4.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * ContactGroup generated by hbm2java
 */
@Entity
@Table(name = "contact_group", catalog = "advcm_db")
public class ContactGroup implements java.io.Serializable {

    private Integer id;
    private Contact contact;
    private String name;
    private String description;
    private String color;
    private Date createdOn;
    private Date lastUpdatedOn;
    private Set<ContactInGroup> contactInGroups = new HashSet<ContactInGroup>(0);
    private Set<ContactInGroup> contactInGroups_1 = new HashSet<ContactInGroup>(
            0);

    public ContactGroup() {
    }

    public ContactGroup(Contact contact, String name, Date createdOn,
            Date lastUpdatedOn) {
        this.contact = contact;
        this.name = name;
        this.createdOn = createdOn;
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public ContactGroup(Contact contact, String name, String description,
            String color, Date createdOn, Date lastUpdatedOn,
            Set<ContactInGroup> contactInGroups,
            Set<ContactInGroup> contactInGroups_1) {
        this.contact = contact;
        this.name = name;
        this.description = description;
        this.color = color;
        this.createdOn = createdOn;
        this.lastUpdatedOn = lastUpdatedOn;
        this.contactInGroups = contactInGroups;
        this.contactInGroups_1 = contactInGroups_1;
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
    @JoinColumn(name = "ContactOwner", nullable = false)
    @NotNull
    public Contact getContact() {
        return this.contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Column(name = "name", nullable = false)
    @NotNull
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "color", length = 7)
    @Length(max = 7)
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contactGroup")
    public Set<ContactInGroup> getContactInGroups() {
        return this.contactInGroups;
    }

    public void setContactInGroups(Set<ContactInGroup> contactInGroups) {
        this.contactInGroups = contactInGroups;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "contactGroup")
    public Set<ContactInGroup> getContactInGroups_1() {
        return this.contactInGroups_1;
    }

    public void setContactInGroups_1(Set<ContactInGroup> contactInGroups_1) {
        this.contactInGroups_1 = contactInGroups_1;
    }

    @PrePersist
    public void prePersist() {
        setCreatedOn(new Date());
        setLastUpdatedOn(new Date());
    }

    @PreUpdate
    public void preUpdate() {
        setLastUpdatedOn(new Date());
    }
}
