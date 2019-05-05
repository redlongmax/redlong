package com.itlaobing.service.impl;
import com.itlaobing.entity.User;
import com.itlaobing.mapper.UserMapper;
import com.itlaobing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Transactional
    @Override
    public int save(User user) {
        //调用mapper中的方法
        int i = userMapper.save(user);
        return i;
    }
}
