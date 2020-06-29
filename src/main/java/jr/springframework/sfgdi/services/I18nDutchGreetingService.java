package jr.springframework.sfgdi.services;

public class I18nDutchGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nDutchGreetingService (GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String groet() {
        return "Hallo Wereld! - NL";
    }
}
