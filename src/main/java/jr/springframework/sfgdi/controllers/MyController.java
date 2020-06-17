package jr.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String zegHallo() {
        System.out.println("Hallo Wereld!");
        return "Hallo allemaal!";
    }
}
