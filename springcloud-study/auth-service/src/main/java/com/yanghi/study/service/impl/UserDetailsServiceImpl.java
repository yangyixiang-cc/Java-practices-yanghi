package com.yanghi.study.service.impl;

import com.yanghi.study.bean.LoginUser;
import com.yanghi.study.bean.User;
import com.yanghi.study.mapper.MenuMapper;
import com.yanghi.study.service.UserService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private MenuMapper menuMapper;

    @SneakyThrows
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //查询用户信息
        User userOneByUsername = userService.getUserOneByUsername(username);
        if(Objects.isNull(userOneByUsername)){
            throw new Exception("用户名或密码错误");
        }

        //获取权限认证信息
        List<String> auths = menuMapper.selectPermsByUserId(userOneByUsername.getId());
        return new LoginUser(userOneByUsername,auths);
    }
}
