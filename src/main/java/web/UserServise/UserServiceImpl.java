package web.UserServise;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.UserDao.UserDao;
import web.model.UserModel;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public List<UserModel> listUsers() {
        return userDao.listUsers();
    }

    @Transactional
    @Override
    public UserModel showUserById(int id) {
        return userDao.showUserById(id);
    }

    @Transactional
    @Override
    public void add(UserModel userModel) {
        userDao.add(userModel);
    }

    @Transactional
    @Override
    public void update(UserModel userModel) {
        userDao.update(userModel);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
