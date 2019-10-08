package com.ngBoot.userportal.user.service;

import com.ngBoot.userportal.user.repository.User;

import java.util.List;

public interface UserService {
    // 구현할 인터페이스 정의
    User create(User user);

    User delete(int id);

    List<User> findAll();

    User findById(int id);

    List<User> findByName(String term);

    User update(User user);
}
