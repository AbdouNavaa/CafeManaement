package com.inn.cafe.JWT;

import com.inn.cafe.dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Objects;


@Slf4j
@Service
public class customerUserDetailsService implements UserDetailsService {
    @Autowired
    UserDao userDao;

    private com.inn.cafe.POJO.User userDetail;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Inside loadUserByUsername {}",username);
        userDetail = userDao.findByEmailId(username);
                if (!Objects.isNull(userDetail))
                    return new org.springframework.security.core.userdetails.User(
                            userDetail.getEmail(),userDetail.getPassword(), new ArrayList<>());

                else throw new UsernameNotFoundException("User Not Found with username: " + username);
    }
    public com.inn.cafe.POJO.User getUserDetail(){
        return userDetail;
    }

}