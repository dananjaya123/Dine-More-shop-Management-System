
package lk.ijse.dinemore.business;

import lk.ijse.dinemore.business.custom.impl.*;


public class BOFactory {

    public enum BOTypes {
       CHEF,DELIVER,RECEPTION,ITEM,CUSTOMER,ODER
    }

    private static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;
    }

    public SuperBO getBO(BOTypes type) {
        switch (type) {
            case CHEF:
                return new ChefBOImpl();
            case DELIVER:
                return new DeliverBOImpl();
            case RECEPTION:
                return new ReceptionBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case CUSTOMER:
                return new CustomerBOImpl();
            case ODER:
                return new OderBOImpl();
            default:
                return null;
        }
    }
}
