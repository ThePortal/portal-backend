package com.portal.portalbackend;

import com.portal.portalbackend.Apartment;
import com.portal.portalbackend.City;
import com.portal.portalbackend.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-19T20:35:57")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile CollectionAttribute<Address, User> userCollection;
    public static volatile SingularAttribute<Address, Integer> coordinates;
    public static volatile SingularAttribute<Address, String> suburb;
    public static volatile SingularAttribute<Address, City> cityId;
    public static volatile CollectionAttribute<Address, Apartment> apartmentCollection;
    public static volatile SingularAttribute<Address, Integer> addressId;

}