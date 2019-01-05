package lk.ijse.dinemore.service.custom;

import lk.ijse.dinemore.dto.ChefDTO;
import lk.ijse.dinemore.service.SuperSarvice;

import java.util.List;

public interface ChefSerive extends SuperSarvice {
    public boolean addChef(ChefDTO chefDTO) throws Exception;

    public boolean updateChef(ChefDTO chefDTO) throws Exception;

    public boolean deleteChef(int id) throws Exception;

    public ChefDTO findChefByID(int ID) throws Exception;

    public List<ChefDTO> getAllChef() throws Exception;
}
