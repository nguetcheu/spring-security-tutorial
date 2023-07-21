package com.nguetcheSpring.springsecurityclient.listener;

import com.nguetcheSpring.springsecurityclient.entity.User;
import com.nguetcheSpring.springsecurityclient.event.RegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        // create the Verification Token for the user with link
        User user = event.getUser();
        String token = UUID.randomUUID().toString();

        // Send mail to user

    }
}
