package com.devd.spring.bookstoreaccountservice.service;

import com.devd.spring.bookstoreaccountservice.web.*;

/**
 * @author: Rtnkanth, Date : 2020-09-27
 */
public interface AuthService {

  CreateOAuthClientResponse createOAuthClient(CreateOAuthClientRequest createOAuthClientRequest);

  String authenticateUser(SignInRequest signInRequest);

  CreateUserResponse registerUser(SignUpRequest signUpRequest);
}
