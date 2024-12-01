package edu.icet.service.impl;

import edu.icet.dto.User;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    private final ModelMapper modelMapper;

    @Override
    public List<User> getAll() {
        List<User> userList = new ArrayList<>();
        repository.findAll().forEach(userEntity -> {
            userList.add(modelMapper.map(userEntity, User.class));
        });
        return userList;
    }

    @Override
    public void addUser(User user) {
        repository.save(modelMapper.map(user, UserEntity.class));
    }

    @Override
    public void deleteUserById(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<User> searchUserByIdOrName(String idOrName) {
        List<User> userList = new ArrayList<>();
        repository.searchUserByIdOrName(idOrName,idOrName).forEach(userEntity -> {
            userList.add(modelMapper.map(userEntity, User.class));
        });
        return userList;
    }

    @Override
    public void updateUser(User user) {
        repository.save(modelMapper.map(user,UserEntity.class));
    }
}
