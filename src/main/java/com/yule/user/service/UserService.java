package com.yule.user.service;

import com.yule.user.entity.User;

import java.util.List;

/**
 * @author yule
 * @date 2018/8/26 13:47
 */
public interface UserService {
    User findById(long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    boolean isUserExist(User user);
}
