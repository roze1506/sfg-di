package jr.springframework.sfgdi.controllers;

import jr.springframework.sfgdi.services.GreetingService;
import jr.springframework.sfgdi.services.GreetingServiceImpl;

public class PropertyInjectedController {

    private GreetingService greetingService = new GreetingServiceImpl();

    public String krijgGroet() {
        return greetingService.groet();
    }
}
