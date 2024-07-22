package br.com.tiago.user_service_api.mapper;

import br.com.tiago.model.enums.ProfileEnum;
import br.com.tiago.model.response.UserResponse;
import br.com.tiago.user_service_api.entities.User;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-14T21:14:12-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse fromEntity(User entity) {
        if ( entity == null ) {
            return null;
        }

        String id = null;
        String nome = null;
        String email = null;
        String password = null;
        Set<ProfileEnum> profile = null;

        if ( entity.getId() != null ) {
            id = entity.getId();
        }
        if ( entity.getNome() != null ) {
            nome = entity.getNome();
        }
        if ( entity.getEmail() != null ) {
            email = entity.getEmail();
        }
        if ( entity.getPassword() != null ) {
            password = entity.getPassword();
        }
        Set<ProfileEnum> set = entity.getProfile();
        if ( set != null ) {
            profile = new LinkedHashSet<ProfileEnum>( set );
        }

        UserResponse userResponse = new UserResponse( id, nome, email, password, profile );

        return userResponse;
    }
}
