package lk.ijse.dinemore.service;

import java.rmi.Remote;

public interface ServiceFactory extends Remote {
    public enum SaviceType{
        CHEF,DELIVER,RECEPTION,ITEM,CUSTOMER,ODER
    }
    public SuperSarvice getSarvice(SaviceType type)throws Exception;
}
