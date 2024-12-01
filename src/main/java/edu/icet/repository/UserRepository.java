package edu.icet.repository;

import edu.icet.dto.User;
import edu.icet.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,String> {
    List<UserEntity> searchUserByIdOrName(String id, String name);
}
