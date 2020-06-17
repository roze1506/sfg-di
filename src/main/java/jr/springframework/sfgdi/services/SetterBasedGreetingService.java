package jr.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterBasedGreetingService implements GreetingService {

    @Override
    public String groet() {
        return "Hallo Wereld vanuit Setter!";
    }
}
