package com.devd.spring.bookstoreaccountservice.repository;

import com.devd.spring.bookstoreaccountservice.repository.dao.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author: Rtnkanth, Date : 2020-05-17
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

  Optional<Role> findByRoleName(String name);

  Boolean existsByRoleName(String roleName);

  @Override
  List<Role> findAll();
}
