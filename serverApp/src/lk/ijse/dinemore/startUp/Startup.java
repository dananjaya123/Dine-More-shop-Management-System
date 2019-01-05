package lk.ijse.dinemore.startUp;


        import lk.ijse.dinemore.service.impl.ServiceFactoryImpl;


        import java.rmi.RemoteException;
        import java.rmi.registry.LocateRegistry;
        import java.rmi.registry.Registry;

public class Startup {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname","127.0.0.1");
            Registry registry = LocateRegistry.createRegistry(5060);
            registry.rebind("dinemore",new ServiceFactoryImpl().getInstance());
            System.out.println("Server has been started successfully");

//            System.out.println(new ChefBOImpl().addChef(null));

        } catch (RemoteException ex) {
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
