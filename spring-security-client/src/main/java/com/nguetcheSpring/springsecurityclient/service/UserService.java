package com.nguetcheSpring.springsecurityclient.service;

import com.nguetcheSpring.springsecurityclient.entity.User;
import com.nguetcheSpring.springsecurityclient.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
