package com.portal.portalbackend;

import com.portal.portalbackend.Address;
import com.portal.portalbackend.Artifact;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-19T20:35:57")
@StaticMetamodel(Apartment.class)
public class Apartment_ { 

    public static volatile CollectionAttribute<Apartment, Artifact> artifactCollection;
    public static volatile SingularAttribute<Apartment, Integer> price;
    public static volatile SingularAttribute<Apartment, Integer> noRooms;
    public static volatile SingularAttribute<Apartment, String> description;
    public static volatile SingularAttribute<Apartment, String> type;
    public static volatile SingularAttribute<Apartment, Integer> apartmentId;
    public static volatile SingularAttribute<Apartment, Address> addressId;

}