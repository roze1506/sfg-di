package jr.springframework.sfgdi.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService maakGreetingService(String taal) {
        switch(taal) {
            case "nl":
                return new I18nDutchGreetingService(greetingRepository);
            case "en":
                return new I18nEnglishGreetingService(greetingRepository);
            case "es":
                return new I18nSpanishGreetingService(greetingRepository);
            default:
                return new I18nDutchGreetingService(greetingRepository);
        }
    }
}
