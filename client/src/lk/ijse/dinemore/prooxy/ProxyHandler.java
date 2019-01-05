package lk.ijse.dinemore.prooxy;

import lk.ijse.dinemore.service.ServiceFactory;
import lk.ijse.dinemore.service.SuperSarvice;
import lk.ijse.dinemore.service.custom.*;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ProxyHandler implements ServiceFactory {
    private static ProxyHandler proxyHandler;
    private ServiceFactory serviceFactory;

    private ChefSerive chefSerive;
    private DeliverService deliverSarvice;
    private ReceptionService receptionService;
    private ItemService itemService;
    private CustomerSerive customerSerive;
    private OderService oderService;

    public ProxyHandler(){
        try {
            serviceFactory =(ServiceFactory) Naming.lookup("rmi://127.0.0.1:5060/dinemore");
             chefSerive = (ChefSerive) serviceFactory.getSarvice(SaviceType.CHEF);
            deliverSarvice=(DeliverService) serviceFactory.getSarvice(SaviceType.DELIVER);
            receptionService=(ReceptionService)serviceFactory.getSarvice(SaviceType.RECEPTION);
            itemService=(ItemService)serviceFactory.getSarvice(SaviceType.ITEM);
            customerSerive=(CustomerSerive)serviceFactory.getSarvice(SaviceType.CUSTOMER);
            oderService=(OderService)serviceFactory.getSarvice(SaviceType.ODER);



        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static ProxyHandler getInstance(){
        if(proxyHandler==null){
            proxyHandler = new ProxyHandler();
        }
        return proxyHandler;
    }

    @Override
    public SuperSarvice getSarvice(SaviceType type) throws Exception {
        switch (type){
            case CHEF:
                return chefSerive;

            case DELIVER:
                return deliverSarvice;

            case RECEPTION:
                return receptionService;

            case ITEM:
                return itemService;

            case CUSTOMER:
                return customerSerive;
            case ODER:
                return oderService;
                default:
                    return null;
        }
    }
}
