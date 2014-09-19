package com.portal.portalbackend;

import com.portal.portalbackend.Address;
import com.portal.portalbackend.Advertisement;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-19T20:35:57")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> phoneNumber;
    public static volatile SingularAttribute<User, Integer> userId;
    public static volatile CollectionAttribute<User, Advertisement> advertisementCollection;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Address> addressId;

}