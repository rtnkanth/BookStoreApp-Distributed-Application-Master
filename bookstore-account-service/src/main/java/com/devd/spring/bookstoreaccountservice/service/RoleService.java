package com.devd.spring.bookstoreaccountservice.service;

import com.devd.spring.bookstoreaccountservice.repository.dao.Role;
import com.devd.spring.bookstoreaccountservice.web.CreateRoleRequest;

import java.util.List;

/**
 * @author: Rtnkanth, Date : 2020-09-27
 */
public interface RoleService {

  String createRole(CreateRoleRequest createRoleRequest);

  List<Role> getAllRoles();
}
