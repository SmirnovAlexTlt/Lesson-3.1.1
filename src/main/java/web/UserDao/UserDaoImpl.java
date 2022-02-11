package web.UserDao;

import org.springframework.stereotype.Repository;
import web.model.UserModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<UserModel> listUsers() {
        return entityManager.createQuery("select u from UserModel u", UserModel.class).getResultList();
    }

    @Override
    public UserModel showUserById(int id) {
        return entityManager.find(UserModel.class, id);
    }

    @Override
    public void add(UserModel userModel) {
        entityManager.persist(userModel);
    }

    @Override
    public void update(UserModel userModel) {
        entityManager.merge(userModel);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(showUserById(id));

    }
}