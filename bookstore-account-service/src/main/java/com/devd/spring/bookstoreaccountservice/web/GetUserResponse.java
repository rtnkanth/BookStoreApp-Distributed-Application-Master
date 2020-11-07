package com.devd.spring.bookstoreaccountservice.web;

import com.devd.spring.bookstoreaccountservice.repository.dao.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @author: Rtnkanth, Date : 2020-10-07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetUserResponse {

  private String userId;
  private String userName;
  private String firstName;
  private String lastName;
  private String email;
  private Set<Role> roles;

}
