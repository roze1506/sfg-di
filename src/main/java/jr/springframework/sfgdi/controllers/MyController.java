package jr.springframework.sfgdi.controllers;

import jr.springframework.sfgdi.services.GreetingService;
import jr.springframework.sfgdi.services.PrimaryGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String zegHallo() {
        return greetingService.groet();
    }
}
