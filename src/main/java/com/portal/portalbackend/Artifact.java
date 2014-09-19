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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ole
 */
@Entity
@Table(name = "artifact")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artifact.findAll", query = "SELECT a FROM Artifact a"),
    @NamedQuery(name = "Artifact.findByArtifactId", query = "SELECT a FROM Artifact a WHERE a.artifactId = :artifactId")})
public class Artifact implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "artifact_id")
    private Integer artifactId;
    @JoinColumn(name = "apartment_id", referencedColumnName = "apartment_id")
    @ManyToOne(optional = false)
    private Apartment apartmentId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artifactId")
    private Collection<Advertisement> advertisementCollection;

    public Artifact() {
    }

    public Artifact(Integer artifactId) {
        this.artifactId = artifactId;
    }

    public Integer getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(Integer artifactId) {
        this.artifactId = artifactId;
    }

    public Apartment getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(Apartment apartmentId) {
        this.apartmentId = apartmentId;
    }

    @XmlTransient
    public Collection<Advertisement> getAdvertisementCollection() {
        return advertisementCollection;
    }

    public void setAdvertisementCollection(Collection<Advertisement> advertisementCollection) {
        this.advertisementCollection = advertisementCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artifactId != null ? artifactId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artifact)) {
            return false;
        }
        Artifact other = (Artifact) object;
        if ((this.artifactId == null && other.artifactId != null) || (this.artifactId != null && !this.artifactId.equals(other.artifactId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portal.portalbackend.Artifact[ artifactId=" + artifactId + " ]";
    }
    
}
