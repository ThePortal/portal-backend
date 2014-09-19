package com.portal.portalbackend;

import com.portal.portalbackend.Artifact;
import com.portal.portalbackend.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-09-19T20:35:57")
@StaticMetamodel(Advertisement.class)
public class Advertisement_ { 

    public static volatile SingularAttribute<Advertisement, Integer> advertisementId;
    public static volatile SingularAttribute<Advertisement, Artifact> artifactId;
    public static volatile SingularAttribute<Advertisement, String> headline;
    public static volatile SingularAttribute<Advertisement, User> userId;

}