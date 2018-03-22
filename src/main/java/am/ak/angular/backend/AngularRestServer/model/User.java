package am.ak.angular.backend.AngularRestServer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User {

    private String firstName;

    private String lastName;

    private String email;

    private String password;
}
