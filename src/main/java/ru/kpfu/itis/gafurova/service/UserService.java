package ru.kpfu.itis.gafurova.service;

import ru.kpfu.itis.gafurova.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    User findOneById(Long id);

    List<User> getAll();
}
