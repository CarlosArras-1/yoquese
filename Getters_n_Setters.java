public class Getters_n_Setters extends Herencia {
    private String language;
    private String coin;
    private String president;

    public Getters_n_Setters(String language, String coin, String president,String name,String surface) {
        super(name,surface);
        this.language = language;
        this.coin = coin;
        this.president = president;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getCoin() {
        return coin;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getPresident() {
        return president;
    }
}
