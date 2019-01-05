package lk.ijse.dinemore.service.custom.impl;

import lk.ijse.dinemore.business.BOFactory;
import lk.ijse.dinemore.business.custom.DeliverBO;
import lk.ijse.dinemore.dto.DeliverDTO;

import lk.ijse.dinemore.service.custom.DeliverService;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class DeliverServiceImpl extends UnicastRemoteObject implements DeliverService  {

    private DeliverBO deliverBO=(DeliverBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.DELIVER);

    public DeliverServiceImpl()throws Exception{

    }



    @Override
    public boolean addDeliver(DeliverDTO deliverDTO) throws Exception {
        return deliverBO.addDeliver(deliverDTO);
    }

    @Override
    public boolean updateDeliver(DeliverDTO deliverDTO) throws Exception {
        return false;
    }

    @Override
    public boolean deleteDeliver(int id) throws Exception {
        return false;
    }

    @Override
    public DeliverDTO findDeliverByID(int ID) throws Exception {
        return null;
    }

    @Override
    public ArrayList<DeliverDTO> getAllDeliver() throws Exception {
        return deliverBO.getAllDeliver();
    }
}
