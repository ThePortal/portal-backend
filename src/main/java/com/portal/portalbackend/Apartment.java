/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portal.portalbackend;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ole
 */
@Entity
@Table(name = "apartment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apartment.findAll", query = "SELECT a FROM Apartment a"),
    @NamedQuery(name = "Apartment.findByApartmentId", query = "SELECT a FROM Apartment a WHERE a.apartmentId = :apartmentId"),
    @NamedQuery(name = "Apartment.findByType", query = "SELECT a FROM Apartment a WHERE a.type = :type"),
    @NamedQuery(name = "Apartment.findByNoRooms", query = "SELECT a FROM Apartment a WHERE a.noRooms = :noRooms"),
    @NamedQuery(name = "Apartment.findByPrice", query = "SELECT a FROM Apartment a WHERE a.price = :price"),
    @NamedQuery(name = "Apartment.findByDescription", query = "SELECT a FROM Apartment a WHERE a.description = :description")})
public class Apartment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "apartment_id")
    private Integer apartmentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "no_rooms")
    private int noRooms;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;
    @Size(max = 45)
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apartmentId")
    private Collection<Artifact> artifactCollection;
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    @ManyToOne(optional = false)
    private Address addressId;

    public Apartment() {
    }

    public Apartment(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public Apartment(Integer apartmentId, String type, int noRooms, int price) {
        this.apartmentId = apartmentId;
        this.type = type;
        this.noRooms = noRooms;
        this.price = price;
    }

    public Integer getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Integer apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoRooms() {
        return noRooms;
    }

    public void setNoRooms(int noRooms) {
        this.noRooms = noRooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<Artifact> getArtifactCollection() {
        return artifactCollection;
    }

    public void setArtifactCollection(Collection<Artifact> artifactCollection) {
        this.artifactCollection = artifactCollection;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (apartmentId != null ? apartmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apartment)) {
            return false;
        }
        Apartment other = (Apartment) object;
        if ((this.apartmentId == null && other.apartmentId != null) || (this.apartmentId != null && !this.apartmentId.equals(other.apartmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portal.portalbackend.Apartment[ apartmentId=" + apartmentId + " ]";
    }
    
}
