package com.ngBoot.userportal.user.service;

import com.ngBoot.userportal.user.repository.UserRepository;
import com.ngBoot.userportal.user.repository.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //정의된 인터페이스 구현
    @Autowired
    private UserRepository repository;

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User delete(int id) {
        User user = findById(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }


    @Override
    public User update(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(int id) {
        return repository.findOne(id);
    }

    @Override
    public List<User> findByName(String term) {
        return repository.findUsersByNameContaining(term);
    }


}
