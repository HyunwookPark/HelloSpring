package com.hellospring.service;

import com.hellospring.auth.User;
import com.hellospring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails user =  userMapper.select(username);
        if (user == null) {
            throw new UsernameNotFoundException("ユーザが存在しない");
        }
        return user;
//        return new User("testuser", "testpass");
    }
}
