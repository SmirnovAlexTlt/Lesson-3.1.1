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


    @Override
    public List<UserModel> listUsers() {
        return userDao.listUsers();
    }


    @Override
    public UserModel showUserById(Long id) {
        return userDao.showUserById(id);
    }


    @Override
    public void add(UserModel userModel) {
        userDao.add(userModel);
    }


    @Override
    public void update(UserModel userModel) {
        userDao.update(userModel);
    }


    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
