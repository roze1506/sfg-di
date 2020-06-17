package jr.springframework.sfgdi.controllers;

import jr.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String krijgGroet() {
        return greetingService.groet();
    }
}
