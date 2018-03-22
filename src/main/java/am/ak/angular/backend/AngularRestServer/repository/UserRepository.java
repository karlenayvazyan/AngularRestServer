package am.ak.angular.backend.AngularRestServer.repository;

import am.ak.angular.backend.AngularRestServer.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
