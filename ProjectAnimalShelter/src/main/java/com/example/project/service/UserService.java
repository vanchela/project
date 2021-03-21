package com.example.project.service;

import com.example.project.model.service.UserRegistrationServiceModel;

public interface UserService {


    boolean usernameExists(String username);

    void registerAndLoginUser(UserRegistrationServiceModel userServiceModel);
}
