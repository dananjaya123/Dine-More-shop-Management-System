package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.OderBO;
import lk.ijse.dinemore.dto.OderDTO;
import lk.ijse.dinemore.repository.RepositoryFactory;
import lk.ijse.dinemore.repository.custom.OderRepository;

import java.util.List;

public class OderBOImpl implements OderBO {

    private OderRepository oderRepository;
    public OderBOImpl(){
        this.oderRepository=(OderRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.ODER);
    }

    @Override
    public boolean add(OderDTO oderDTO) throws Exception {
        return false;
    }

    @Override
    public void delete(int id) throws Exception {

    }

    @Override
    public void update(OderDTO oderDTO) throws Exception {

    }

    @Override
    public OderDTO findById(int id) throws Exception {
        return null;
    }

    @Override
    public List<OderDTO> getAll() throws Exception {
        return null;
    }
}
