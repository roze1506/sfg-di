package jr.springframework.sfgdi.controllers;

import jr.springframework.sfgdi.services.GreetingService;
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
