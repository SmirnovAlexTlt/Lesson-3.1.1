package web.UserDao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
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
    public UserModel showUserById(Long id) {
        return entityManager.find(UserModel.class, id);
    }

    @Transactional
    @Override
    public void add(UserModel userModel) {
        entityManager.persist(userModel);
    }

    @Transactional
    @Override
    public void update(UserModel userModel) {
        entityManager.merge(userModel);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        entityManager.remove(showUserById(id));

    }
}