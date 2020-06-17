package jr.springframework.sfgdi.controllers;

import jr.springframework.sfgdi.services.GreetingService;

public class SetterBasedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String krijgGroet() {
        return greetingService.groet();
    }
}
