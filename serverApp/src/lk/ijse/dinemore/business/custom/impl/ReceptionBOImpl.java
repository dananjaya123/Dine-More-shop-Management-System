package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.ReceptionBO;
import lk.ijse.dinemore.dto.ReceptionDTO;
import lk.ijse.dinemore.entity.Reception;
import lk.ijse.dinemore.repository.RepositoryFactory;
import lk.ijse.dinemore.repository.custom.ReceptionRepository;
import lk.ijse.dinemore.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class ReceptionBOImpl implements ReceptionBO {
    ReceptionRepository receptionRepository;

    public ReceptionBOImpl(){
        this.receptionRepository=(ReceptionRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.RECEPTION);
    }


    @Override
    public boolean add(ReceptionDTO receptionDTO) throws Exception {
        try (Session session= HibernateUtil.getSessionFactory().openSession()){
            receptionRepository.setSession(session);
            session.getTransaction();
            session.beginTransaction();

            Reception reception=new Reception(
                    receptionDTO.getReceptionID(),
                    receptionDTO.getNic(),
                    receptionDTO.getName(),
                    receptionDTO.getAddress(),
                    receptionDTO.getPhoneNo()

            );

            receptionRepository.save(reception);
            session.getTransaction().commit();
        }
        return true;
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
        Session session=HibernateUtil.getSessionFactory().openSession();
        receptionRepository.setSession(session);
        session.beginTransaction();
        List<Reception>receptions=receptionRepository.findAll();
        session.getTransaction().commit();
        if (receptions !=null){
            List<ReceptionDTO>allReception=new ArrayList<>();
            for(Reception reception: receptions){
                ReceptionDTO receptionDTO=new ReceptionDTO(reception.getReceptionID(), reception.getNic(), reception.getName(), reception.getAddress(),reception.getPhoneNo());

                allReception.add(receptionDTO);

            }
            return (ArrayList<ReceptionDTO>) allReception;
        }else {
            return null;
        }
    }
}
