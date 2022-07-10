package en.univercity.event.controller.registration;

import ch.qos.logback.core.Context;
import en.univercity.event.services.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    public String register(@RequestBody RegistrationRequest request){
        Context registrationRequest;
        return RegistrationService.register(request);
    }
}
