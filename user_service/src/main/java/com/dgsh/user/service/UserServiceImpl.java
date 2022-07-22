package com.dgsh.user.service;

import com.dgsh.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake user list
    List<User> list = List.of(
            new User(1311L,"Durgesh Yadav","7054392177"),
            new User(1312L,"Ankit Yadav","9999999997"),
            new User(1313L,"Mukesh Singh","8810456785")

    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
