package en.univercity.event.controller.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String name;
    private final String lastName;
    private final String email;
    private final String password;

    public String getFirstName() {
        return name;
    }
}
