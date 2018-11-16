package workshop02.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import workshop02.model.Customer;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-16T11:16:55")
@StaticMetamodel(PurchaseOrder.class)
public class PurchaseOrder_ { 

    public static volatile SingularAttribute<PurchaseOrder, Integer> quantity;
    public static volatile SingularAttribute<PurchaseOrder, Float> shippingCost;
    public static volatile SingularAttribute<PurchaseOrder, Integer> productId;
    public static volatile SingularAttribute<PurchaseOrder, Date> shippingDate;
    public static volatile SingularAttribute<PurchaseOrder, Date> salesDate;
    public static volatile SingularAttribute<PurchaseOrder, String> freightCompany;
    public static volatile SingularAttribute<PurchaseOrder, Integer> orderNum;
    public static volatile SingularAttribute<PurchaseOrder, Customer> customer;

}