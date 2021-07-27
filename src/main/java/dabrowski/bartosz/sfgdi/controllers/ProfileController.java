package dabrowski.bartosz.sfgdi.controllers;

import dabrowski.bartosz.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileController {
    private final GreetingService greetingService;

    public ProfileController(@Qualifier("ProfileService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
