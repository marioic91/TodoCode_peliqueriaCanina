package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.logica.Dueno;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-23T08:04:44", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, Dueno> dueno;
    public static volatile SingularAttribute<Mascota, String> raza;
    public static volatile SingularAttribute<Mascota, String> color;
    public static volatile SingularAttribute<Mascota, Boolean> atencionEsp;
    public static volatile SingularAttribute<Mascota, Boolean> alergico;
    public static volatile SingularAttribute<Mascota, String> observaciones;
    public static volatile SingularAttribute<Mascota, Integer> id;
    public static volatile SingularAttribute<Mascota, String> nombre;

}