package br.com.tiago.user_service_api.mapper;

import br.com.tiago.model.response.UserResponse;
import br.com.tiago.user_service_api.entities.User;
import org.mapstruct.Mapper;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(componentModel = "spring",
    nullValuePropertyMappingStrategy = IGNORE,
    nullValueCheckStrategy = ALWAYS
)
public interface UserMapper {

    UserResponse fromEntity (final User entity);
}