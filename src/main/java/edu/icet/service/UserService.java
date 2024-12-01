package edu.icet.service;

import edu.icet.dto.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    void addUser(User user);
    void deleteUserById(String id);
    List<User> searchUserByIdOrName(String idOrName);
    void updateUser(User user);
}
