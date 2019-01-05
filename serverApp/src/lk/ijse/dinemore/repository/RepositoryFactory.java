
package lk.ijse.dinemore.repository;

import lk.ijse.dinemore.business.custom.impl.OderBOImpl;
import lk.ijse.dinemore.repository.custom.impl.*;

public class RepositoryFactory {

    public enum RepositoryTypes {
        CHEF,DELIVER,RECEPTION,ITEM,CUSTOMER,ODER
    }

    public static RepositoryFactory repositoryFactory;

    private RepositoryFactory() {

    }

    public static RepositoryFactory getInstance() {
        if (repositoryFactory == null) {
            repositoryFactory = new RepositoryFactory();
        }
        return repositoryFactory;
    }

    public SuperRepository getRepository(RepositoryTypes type) {
        switch (type) {
            case CHEF:
              return new ChefRepositoryImpl();
            case DELIVER:
                return new DeliverRepositoryImpl();

            case RECEPTION:
                return new ReceptionRepositoryImpl();

            case ITEM:
                return new ItemRepositoryImpl();

            case CUSTOMER:
                return  new CustomerRepositoryImpl();
            case ODER:
                return new OderRepositoryImpl();
            default:
                return null;
        }
    }
}
