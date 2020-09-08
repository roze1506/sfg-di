package jr.springframework.sfgdi.config;

import jr.springframework.sfgdi.examplebeans.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${jr.gebruikersnaam}")
    private String gebruikersnaam;

    @Value("${jr.wachtwoord}")
    private String wachtwoord;

    @Value("${jr.dburl}")
    private String url;

    @Bean
    public DataSource krijgDataSource() {
        final DataSource dataSource = new DataSource();
        dataSource.setGebruikersnaam(this.gebruikersnaam);
        dataSource.setWachtwoord(this.wachtwoord);
        dataSource.setUrl(this.url);
        return dataSource;
    }

    public static PropertySourcesPlaceholderConfigurer properties() {
        final PropertySourcesPlaceholderConfigurer psphc = new PropertySourcesPlaceholderConfigurer();
        return psphc;
    }
}
