package org.example.controller;

import org.example.api.spec.controller.v1.UserApi;
import org.example.api.spec.dto.v1.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;

@Controller
public class UserController implements UserApi {

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        User user = new User();

        user.setId(1L);
        user.setUsername(username);
        user.setFirstName(username);
        user.setLastName("lastname");
        user.setEmail("email");

        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<User> createUser(@Valid User user) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUser(String username) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUser(String username, @Valid User user) {
        return null;
    }
}
