package br.com.tiago.user_service_api.services;

import br.com.tiago.model.exceptions.ResourceNotFoundExceptions;
import br.com.tiago.model.response.UserResponse;
import br.com.tiago.user_service_api.mapper.UserMapper;
import br.com.tiago.user_service_api.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper userMapper;

    private final UserRepository userRepository;

    public UserResponse findById (final String id){
        return userMapper.fromEntity(userRepository.findById(id).orElseThrow(() ->
                        new ResourceNotFoundExceptions("object not found, id: " +
                                id + " type: " + UserResponse.class.getSimpleName())));
    }
}
