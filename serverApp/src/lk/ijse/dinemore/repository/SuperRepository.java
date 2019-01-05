

package lk.ijse.dinemore.repository;
import java.util.List;
import org.hibernate.Session;


public interface SuperRepository<T, ID> {

    public void setSession(Session session);

    public boolean save(T t) throws Exception;

    public void delete(ID t) throws Exception;

    public void update(T t) throws Exception;

    public T findById(ID id) throws Exception;

    public List<T> findAll() throws Exception;
}
