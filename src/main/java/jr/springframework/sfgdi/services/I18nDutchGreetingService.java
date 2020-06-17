package jr.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("NL")
@Service("i18nService")
public class I18nDutchGreetingService implements GreetingService {

    @Override
    public String groet() {
        return "Hallo Wereld! - NL";
    }
}
