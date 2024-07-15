package br.com.tiago.user_service_api.controllers;

import br.com.tiago.model.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/users")
public interface UserController {

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> findById (@PathVariable(name = "id") final String id);
}
