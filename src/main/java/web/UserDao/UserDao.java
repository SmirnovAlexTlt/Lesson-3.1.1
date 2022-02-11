package web.UserDao;

import web.model.UserModel;

import java.util.List;

public interface UserDao {

    List<UserModel> listUsers();

    UserModel showUserById(int id);

    void add(UserModel userModel);

    void update(UserModel userModel);

    void delete(int id);
}

