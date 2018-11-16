package workshop02.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import workshop02.model.Customer;
import workshop02.model.DiscountCode.Code;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-16T11:16:55")
@StaticMetamodel(DiscountCode.class)
public class DiscountCode_ { 

    public static volatile SingularAttribute<DiscountCode, Code> discountCode;
    public static volatile SingularAttribute<DiscountCode, Float> rate;
    public static volatile ListAttribute<DiscountCode, Customer> customers;

}