package am.ak.angular.backend.AngularRestServer.controller;

import am.ak.angular.backend.AngularRestServer.model.User;
import am.ak.angular.backend.AngularRestServer.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registration")
    public Mono<User> registration(@RequestBody User user) {
        return userService.addUser(user);
    }
}
