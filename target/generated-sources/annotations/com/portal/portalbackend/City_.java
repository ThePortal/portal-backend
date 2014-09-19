package com.portal.portalbackend;

import com.portal.portalbackend.Address;
import com.portal.portalbackend.Country;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-19T20:35:57")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile CollectionAttribute<City, Address> addressCollection;
    public static volatile SingularAttribute<City, String> name;
    public static volatile SingularAttribute<City, Integer> cityId;
    public static volatile SingularAttribute<City, Country> countryId;

}