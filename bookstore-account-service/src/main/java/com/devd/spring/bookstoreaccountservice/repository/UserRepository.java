package com.devd.spring.bookstoreaccountservice.repository;


import com.devd.spring.bookstoreaccountservice.repository.dao.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author: Rtnkanth, Date : 2020-05-17
 */
public interface UserRepository extends CrudRepository<User, Long> {

  Optional<User> findByUserName(String username);

  Optional<User> findByUserNameOrEmail(String uName, String eMail);

  Optional<User> findByUserId(String userId);

  Boolean existsByUserName(String userName);

  Boolean existsByEmail(String email);
}
