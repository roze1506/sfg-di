package jr.springframework.sfgdi.examplebeans;

public class JmsBroker {

    private String gebruikersnaam;
    private String wachtwoord;
    private String url;

    public String getGebruikersnaam() {
        return this.gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return this.wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
