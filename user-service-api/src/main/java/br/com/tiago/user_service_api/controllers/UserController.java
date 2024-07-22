package br.com.tiago.user_service_api.controllers;

import br.com.tiago.model.response.UserResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "UserController", description = "Controller responsible for user operations")
@RequestMapping("api/users")
public interface UserController {

    @Operation(summary = "Find user by id")

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> findById (@PathVariable(name = "id") final String id);
}
