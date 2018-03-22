package am.ak.angular.backend.AngularRestServer.service;

import am.ak.angular.backend.AngularRestServer.model.User;
import am.ak.angular.backend.AngularRestServer.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<User> addUser(User user) {
        return userRepository.save(user);
    }
}
