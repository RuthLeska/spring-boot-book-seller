package com.fu.springbootbookseller.service;

import com.fu.springbootbookseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
