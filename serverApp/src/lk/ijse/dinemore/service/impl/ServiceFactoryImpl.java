/**/
package lk.ijse.dinemore.service.impl;

import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.SuperSarvice;
import lk.ijse.dinemore.service.custom.impl.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory {

    private static ServiceFactory serviceFactory;

    public ServiceFactoryImpl() throws RemoteException {

    }

    public  ServiceFactory getInstance() throws RemoteException {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactoryImpl();
        }
        return serviceFactory;
    }


    @Override
    public SuperSarvice getSarvice(SaviceType type) throws Exception {
        switch (type) {
            case CHEF:
                return new ChefServiceImpl();

            case DELIVER:
                return new DeliverServiceImpl();

            case RECEPTION:
                return new ReceptionServiceImpl();
            case ITEM:
                return new ItemServiceImpl();
            case CUSTOMER:
                return new CustomerServiceImpl();
            case ODER:
                return new OderServiceImpl();
            default:
                return null;
        }
    }
}
