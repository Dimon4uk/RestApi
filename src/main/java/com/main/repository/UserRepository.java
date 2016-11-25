package com.main.repository;


import com.main.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by dmytrok on 08.11.2016.
 */
public interface UserRepository extends CrudRepository<User,Long> {

   User findByUsername (String email);

   User save(User user);
}
