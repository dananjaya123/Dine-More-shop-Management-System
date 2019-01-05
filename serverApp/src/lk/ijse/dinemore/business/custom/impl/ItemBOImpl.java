package lk.ijse.dinemore.business.custom.impl;

import lk.ijse.dinemore.business.custom.ItemBO;
import lk.ijse.dinemore.dto.ItemDTO;
import lk.ijse.dinemore.entity.Item;
import lk.ijse.dinemore.repository.RepositoryFactory;
import lk.ijse.dinemore.repository.custom.ItemRepository;
import lk.ijse.dinemore.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class ItemBOImpl implements ItemBO {

    ItemRepository itemRepository;

    public ItemBOImpl(){

        this.itemRepository=(ItemRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryTypes.ITEM);
    }

    @Override
    public boolean add(ItemDTO itemDTO) throws Exception {
        try (Session session= HibernateUtil.getSessionFactory(). openSession()){
            itemRepository.setSession(session);
            session.getTransaction();
            session.beginTransaction();

            Item item=new Item(
                    itemDTO.getItemID(),
                    itemDTO.getItem_Name(),
                    itemDTO.getItem_Discription(),
                    itemDTO.getItem_Price()

            );

            itemRepository.save(item);
            session.getTransaction().commit();
        }
        return true;
    }

    @Override
    public void delete(int id) throws Exception {

    }

    @Override
    public void update(ItemDTO itemDTO) throws Exception {

    }

    @Override
    public ItemDTO findById(int id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<ItemDTO> getAll() throws Exception {
       Session session=HibernateUtil.getSessionFactory().openSession();
       itemRepository.setSession(session);
       session.beginTransaction();
        List<Item>items=itemRepository.findAll();
        session.getTransaction().commit();

        if (items !=null){
            List<ItemDTO>allItem=new ArrayList<>();
            for (Item item:items){
                ItemDTO itemDTO=new ItemDTO(item.getItemID(),item.getItem_Name(),item.getItem_Discription(),item.getItem_Price());

                allItem.add(itemDTO);

            }
            return (ArrayList<ItemDTO>)allItem;
        }else {
            return null;
        }

    }


}
