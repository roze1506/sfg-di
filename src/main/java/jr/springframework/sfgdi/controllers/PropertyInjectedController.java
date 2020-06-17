package jr.springframework.sfgdi.controllers;

import jr.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    private GreetingService greetingService;

    public String krijgGroet() {
        return greetingService.groet();
    }
}
