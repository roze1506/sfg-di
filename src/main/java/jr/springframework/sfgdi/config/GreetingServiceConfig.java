package jr.springframework.sfgdi.config;

import jr.springframework.sfgdi.services.GreetingRepository;
import jr.springframework.sfgdi.services.GreetingService;
import jr.springframework.sfgdi.services.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"default", "nl"})
    public GreetingService i18nDutchGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.maakGreetingService("nl");
    }

    @Bean
    @Primary
    @Profile("en")
    public GreetingService  i18nEnglishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.maakGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    public GreetingService  i18nSpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
        return greetingServiceFactory.maakGreetingService("es");
    }
}
