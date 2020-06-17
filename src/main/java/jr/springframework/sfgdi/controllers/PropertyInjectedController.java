package jr.springframework.sfgdi.controllers;

import jr.springframework.sfgdi.services.GreetingService;
import jr.springframework.sfgdi.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    private GreetingService greetingService;

    public String krijgGroet() {
        return greetingService.groet();
    }
}
