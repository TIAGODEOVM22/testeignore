package br.com.tiago.user_service_api.controllers;

import br.com.tiago.model.exceptions.StandardError;
import br.com.tiago.model.response.UserResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Tag(name = "UserController", description = "Controller responsible for user operations")
@RequestMapping("api/users")
public interface UserController {

    @Operation(summary = "Find user by id")
    @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "User Found"),

    @ApiResponse(
            responseCode = "404", description = "User Not Found",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = StandardError.class)
            )),

    @ApiResponse(responseCode = "500", description = "Internal Server Error",
            content = @Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = StandardError.class)
            ))}
    )


@GetMapping("/{id}")
public ResponseEntity<UserResponse> findById(
        /*exemplo na tela do swagger*/
        @Parameter(
                description = "User ID", required = true, example = "6691cbba9fb1762b376a0224")
        @PathVariable(
                name = "id") final String id);
}
