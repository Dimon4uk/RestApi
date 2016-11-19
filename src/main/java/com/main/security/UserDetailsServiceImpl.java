package com.main.security;

import com.main.model.User;
import com.main.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий on 19.11.2016.
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails;
        logger.info("Loading user record with user name: {}", username);

        User user = userRepository.findByUsername(username);

        if(user == null) {
            logger.info("User with username = {} not found", username);
            throw new UsernameNotFoundException("User" + username + "not found");
        }

        return fetchUserDetails(user);
    }

    private UserDetails fetchUserDetails(User user) {
        String roleName = user.getRole();

        List<GrantedAuthority> authorities = new ArrayList<>();

            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(roleName);
            authorities.add(grantedAuthority);


        return new UserDetails(user.getEmail(), user.getPassword(), user.isEnabled(), true, true, true, authorities);
    }
}
