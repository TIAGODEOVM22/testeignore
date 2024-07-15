package br.com.tiago.model.response;

import br.com.tiago.model.enums.ProfileEnum;

import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

public record UserResponse(
        String id,
        String nome,
        String email,
        String password,
        Set<ProfileEnum> profile) implements Serializable {

@Serial
private static final Long serialVersionUID = 1L;

}
