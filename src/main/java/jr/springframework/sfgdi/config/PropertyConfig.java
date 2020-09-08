package jr.springframework.sfgdi.config;

import jr.springframework.sfgdi.examplebeans.DataSource;
import jr.springframework.sfgdi.examplebeans.JmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class PropertyConfig {

    @Value("${jr.gebruikersnaam}")
    private String gebruikersnaam;

    @Value("${jr.wachtwoord}")
    private String wachtwoord;

    @Value("${jr.dburl}")
    private String url;

    @Value("${jr.jms.gebruikersnaam}")
    private String jmsGebruikersnaam;

    @Value("${jr.jms.wachtwoord}")
    private String jmsWachtwoord;

    @Value("${jr.jms.dburl}")
    private String jmsUrl;

    @Bean
    public DataSource krijgDataSource() {
        final DataSource dataSource = new DataSource();
        dataSource.setGebruikersnaam(this.gebruikersnaam);
        dataSource.setWachtwoord(this.wachtwoord);
        dataSource.setUrl(this.url);
        return dataSource;
    }

    @Bean
    public JmsBroker krijgJmsBroker() {
        final JmsBroker jmsBroker = new JmsBroker();
        jmsBroker.setGebruikersnaam(this.jmsGebruikersnaam);
        jmsBroker.setWachtwoord(this.jmsWachtwoord);
        jmsBroker.setUrl(this.jmsUrl);
        return jmsBroker;
    }

    public static PropertySourcesPlaceholderConfigurer properties() {
        final PropertySourcesPlaceholderConfigurer psphc = new PropertySourcesPlaceholderConfigurer();
        return psphc;
    }
}
