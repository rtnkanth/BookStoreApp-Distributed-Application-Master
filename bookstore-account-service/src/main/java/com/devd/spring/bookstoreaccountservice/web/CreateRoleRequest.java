package com.devd.spring.bookstoreaccountservice.web;

import com.devd.spring.bookstoreaccountservice.repository.dao.DateAudit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author: Rtnkanth, Date : 2020-06-30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRoleRequest extends DateAudit {

  @NotBlank
  private String roleName;
  @NotBlank
  private String roleDescription;

}
