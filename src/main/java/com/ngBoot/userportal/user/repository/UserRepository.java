package com.ngBoot.userportal.user.repository;

import com.ngBoot.userportal.user.repository.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User, Integer> {

    void delete(User user);

    List<User> findAll();

    User findOne(int id);

    List<User> findUsersByNameContaining(String term);

    User save(User user);
}
