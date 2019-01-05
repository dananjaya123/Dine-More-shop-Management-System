package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.ChefBO;
import lk.ijse.dinemore.dto.ChefDTO;
import lk.ijse.dinemore.entity.Chef;
import lk.ijse.dinemore.repository.RepositoryFactory;
import lk.ijse.dinemore.repository.custom.ChefRepository;
import lk.ijse.dinemore.util.HibernateUtil;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.List;

public class ChefBOImpl implements ChefBO {
    private ChefRepository chefRepository;
    private int id;

    public  ChefBOImpl() {
        this.chefRepository= (ChefRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.CHEF);
    }


    @Override
    public boolean addChef(ChefDTO chefDTO) throws Exception {
        try (Session session= HibernateUtil.getSessionFactory().openSession()){
            chefRepository.setSession(session);
            session.getTransaction();
            session.beginTransaction();

            Chef chef=new Chef(
                    chefDTO.getChefID(),
                    chefDTO.getNic(),
                    chefDTO.getName(),
                    chefDTO.getAddress(),
                    chefDTO.getPhoneNo()

            );

            chefRepository.save(chef);
            session.getTransaction().commit();
        }
        return true;
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
     Session session=HibernateUtil.getSessionFactory().openSession();
     chefRepository.setSession(session);
     session.beginTransaction();
     List<Chef>chefs=chefRepository.findAll();
     session.getTransaction().commit();
     if (chefs !=null){
       List<ChefDTO>alChef=new ArrayList<>();
       for(Chef chef: chefs){
           ChefDTO chefDTO=new ChefDTO(chef.getChefID(), chef.getNic(), chef.getName(), chef.getAddress(),chef.getPhoneNo());

           alChef.add(chefDTO);

       }
       return (ArrayList<ChefDTO>) alChef;
     }else {
         return null;
     }
    }
}




