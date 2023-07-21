package com.nguetcheSpring.springsecurityclient.controller;

import com.nguetcheSpring.springsecurityclient.entity.User;
import com.nguetcheSpring.springsecurityclient.event.RegistrationCompleteEvent;
import com.nguetcheSpring.springsecurityclient.model.UserModel;
import com.nguetcheSpring.springsecurityclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class registrationController  {

    @Autowired
    private UserService userService;

    @Autowired
    private ApplicationEventPublisher publisher;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel) {
        User user = userService.registerUser(userModel);
        publisher.publishEvent(new RegistrationCompleteEvent(
                user,"url"
        ));
        return "Success";
    }
}
