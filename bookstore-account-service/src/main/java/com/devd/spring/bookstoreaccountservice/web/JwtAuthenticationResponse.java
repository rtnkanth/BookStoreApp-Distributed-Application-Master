package com.devd.spring.bookstoreaccountservice.web;

import lombok.Value;

/**
 * @author Rtnkanth Date : 2020-10-07
 */
@Value
public class JwtAuthenticationResponse {

  private String accessToken;
  private String tokenType = "Bearer";
}
