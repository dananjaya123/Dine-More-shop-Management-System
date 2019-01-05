package lk.ijse.dinemore.business.custom.impl;


import lk.ijse.dinemore.business.custom.DeliverBO;
import lk.ijse.dinemore.dto.DeliverDTO;
import lk.ijse.dinemore.entity.Deliver;
import lk.ijse.dinemore.repository.RepositoryFactory;
import lk.ijse.dinemore.repository.custom.DeliverRepository;
import lk.ijse.dinemore.util.HibernateUtil;
import org.hibernate.Session;


import java.util.ArrayList;
import java.util.List;

public class DeliverBOImpl implements DeliverBO {
    DeliverRepository deliverRepository;
    private int id;

    public DeliverBOImpl(){
        this.deliverRepository=(DeliverRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.DELIVER);
    }


    @Override
    public boolean addDeliver(DeliverDTO deliverDTO) throws Exception {
        try (Session session= HibernateUtil.getSessionFactory().openSession()){
            deliverRepository.setSession(session);
            session.getTransaction();
            session.beginTransaction();

            Deliver deliver=new Deliver(
                    deliverDTO.getDeliverID(),
                    deliverDTO.getNic(),
                    deliverDTO.getName(),
                    deliverDTO.getAddress(),
                    deliverDTO.getPhoneNo()

            );

            deliverRepository.save(deliver);
            session.getTransaction().commit();
        }
        return true;
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
        Session session=HibernateUtil.getSessionFactory().openSession();
        deliverRepository.setSession(session);
        session.beginTransaction();
        List<Deliver> chefs=deliverRepository.findAll();
        session.getTransaction().commit();
        if (chefs !=null){
            ArrayList<DeliverDTO>allDeliver=new ArrayList<>();
            for(Deliver deliver: chefs){
                DeliverDTO dto=new DeliverDTO(deliver.getDeliverID(), deliver.getNic(), deliver.getName(), deliver.getAddress(),deliver.getPhoneNo());

                allDeliver.add(dto);

            }
            return (ArrayList<DeliverDTO>) allDeliver;
        }else {
            return null;
        }
    }
}