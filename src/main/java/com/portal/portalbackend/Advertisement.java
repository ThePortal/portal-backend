/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portal.portalbackend;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ole
 */
@Entity
@Table(name = "advertisement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Advertisement.findAll", query = "SELECT a FROM Advertisement a"),
    @NamedQuery(name = "Advertisement.findByAdvertisementId", query = "SELECT a FROM Advertisement a WHERE a.advertisementId = :advertisementId"),
    @NamedQuery(name = "Advertisement.findByHeadline", query = "SELECT a FROM Advertisement a WHERE a.headline = :headline")})
public class Advertisement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "advertisement_id")
    private Integer advertisementId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "headline")
    private String headline;
    @JoinColumn(name = "artifact_id", referencedColumnName = "artifact_id")
    @ManyToOne(optional = false)
    private Artifact artifactId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private User userId;

    public Advertisement() {
    }

    public Advertisement(Integer advertisementId) {
        this.advertisementId = advertisementId;
    }

    public Advertisement(Integer advertisementId, String headline) {
        this.advertisementId = advertisementId;
        this.headline = headline;
    }

    public Integer getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(Integer advertisementId) {
        this.advertisementId = advertisementId;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Artifact getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(Artifact artifactId) {
        this.artifactId = artifactId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (advertisementId != null ? advertisementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Advertisement)) {
            return false;
        }
        Advertisement other = (Advertisement) object;
        if ((this.advertisementId == null && other.advertisementId != null) || (this.advertisementId != null && !this.advertisementId.equals(other.advertisementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portal.portalbackend.Advertisement[ advertisementId=" + advertisementId + " ]";
    }
    
}
