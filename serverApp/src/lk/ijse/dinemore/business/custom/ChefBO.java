package lk.ijse.dinemore.business.custom;

import lk.ijse.dinemore.business.SuperBO;
import lk.ijse.dinemore.dto.ChefDTO;

import java.util.ArrayList;

public interface ChefBO extends SuperBO {
    public boolean addChef(ChefDTO chefDTO) throws Exception;

    public boolean updateChef(ChefDTO chefDTO) throws Exception;

    public boolean deleteChef(int id) throws Exception;

    public ChefDTO findChefByID(int ID) throws Exception;

    public ArrayList<ChefDTO> getAllChef() throws Exception;

}
