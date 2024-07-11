package br.com.tiago.user_service_api.services;

import br.com.tiago.user_service_api.entities.User;
import br.com.tiago.user_service_api.repositories.UserRepository;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public User findById (final String id){
        return userRepository.findById(id).orElse(null);
    }
}
