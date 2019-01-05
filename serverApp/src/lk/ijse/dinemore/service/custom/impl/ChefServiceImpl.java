package lk.ijse.dinemore.service.custom.impl;

import lk.ijse.dinemore.business.BOFactory;
import lk.ijse.dinemore.business.custom.ChefBO;
import lk.ijse.dinemore.dto.ChefDTO;
import lk.ijse.dinemore.service.custom.ChefSerive;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ChefServiceImpl extends UnicastRemoteObject implements ChefSerive  {

    private ChefBO chefBO= (ChefBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CHEF);

    public ChefServiceImpl() throws RemoteException {
    }

    @Override
    public boolean addChef(ChefDTO chefDTO) throws Exception {
       return chefBO.addChef(chefDTO);
    }

    @Override
    public boolean updateChef(ChefDTO chefDTO) throws Exception {
        return false;
    }

    @Override
    public boolean deleteChef(int id) throws Exception {
        return false;
    }

    @Override
    public ChefDTO findChefByID(int ID) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ChefDTO> getAllChef() throws Exception {
        return chefBO.getAllChef();
    }


}
