package services;

import dao.UserDao;
import models.Auto;
import models.User;

import java.util.List;

public class UserService {
    private static UserDao userDao = new UserDao();
    public UserService() {}

    public User findUser(int id) {
        return userDao.findById(id);
    }
    public void save(User user) {
        userDao.save(user);
    }
    public void update(User user) {
        userDao.update(user);
    }
    public void delete(User user) {
        userDao.delete(user);
    }
    public void deleteAuto (Auto auto) {
        userDao.deleteAuto(auto);
    }
    public List<User> findAllUsers() {
        return userDao.findAll();
    }
    public Auto findAutoById(int id) {
        return userDao.findAutoById(id);
    }
    public List<Auto> findAutoByName(String name) {
        return userDao.findAutoByName(name);
    }

}
