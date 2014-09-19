package com.portal.portalbackend;

import com.portal.portalbackend.Advertisement;
import com.portal.portalbackend.Apartment;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-19T20:35:57")
@StaticMetamodel(Artifact.class)
public class Artifact_ { 

    public static volatile SingularAttribute<Artifact, Integer> artifactId;
    public static volatile CollectionAttribute<Artifact, Advertisement> advertisementCollection;
    public static volatile SingularAttribute<Artifact, Apartment> apartmentId;

}