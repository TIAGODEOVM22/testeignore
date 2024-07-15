package br.com.tiago.user_service_api.controllers.impl;

import br.com.tiago.model.response.UserResponse;
import br.com.tiago.user_service_api.controllers.UserController;
import br.com.tiago.user_service_api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserControllerImpl implements UserController {

    private final UserService userService;

    @Override
    public ResponseEntity<UserResponse> findById(String id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }


}
