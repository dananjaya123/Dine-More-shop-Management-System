
package lk.ijse.dinemore.repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;

public abstract class SuperRepositoryImpl<T, ID extends Serializable> implements SuperRepository<T,ID> {

    protected Session session;
    protected Class<T> entityClass;

    public SuperRepositoryImpl() {
        entityClass = (Class<T>) (((ParameterizedType) (this.getClass().getGenericSuperclass())).getActualTypeArguments()[0]);
        System.out.println(entityClass);
    }

    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public boolean save(T t) throws Exception {
        return (session.save(t) != null);
    }

    @Override
    public void delete(ID t) throws Exception {
        session.delete(t);
    }

    @Override
    public void update(T t) throws Exception {
        session.update(t);
    }

    @Override
    public T findById(ID id) throws Exception {
        return session.get(entityClass, id);
    }

    @Override
    public List<T> findAll() throws Exception {
        return session.createQuery("FROM " + entityClass.getSimpleName()).list();
    }

}
