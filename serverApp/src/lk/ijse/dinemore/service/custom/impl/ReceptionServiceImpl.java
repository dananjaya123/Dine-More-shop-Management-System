package lk.ijse.dinemore.service.custom.impl;

import lk.ijse.dinemore.business.BOFactory;
import lk.ijse.dinemore.business.custom.ReceptionBO;
import lk.ijse.dinemore.dto.ReceptionDTO;

import lk.ijse.dinemore.service.custom.ReceptionService;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ReceptionServiceImpl extends UnicastRemoteObject implements ReceptionService {

    private ReceptionBO receptionBO=(ReceptionBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.RECEPTION);

    public ReceptionServiceImpl ()throws Exception{

    }



    @Override
    public boolean add(ReceptionDTO receptionDTO) throws Exception {

        return receptionBO.add(receptionDTO);
    }

    @Override
    public boolean update(ReceptionDTO receptionDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(int id) throws Exception {
        return false;
    }

    @Override
    public ReceptionDTO findByID(int ID) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ReceptionDTO> getAll() throws Exception {
        return receptionBO.getAll();
    }
}
