package Model;

/**
 * This class contains all information about someones nation and it's statistics.
 * @version 0.1
 * @author Jan Kammellander
 */
public class Nation implements NationInterface{
    // Nation attributes
    private String name;
    private String currency;
    private String inhabitants;
    private String militaryName;
    private String airforceName;
    private String navyName;
    private Flag flag;

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setInhabitants(String inhabitants) {
        this.inhabitants = inhabitants;
    }

    public void setMilitaryName(String militaryName) {
        this.militaryName = militaryName;
    }

    public void setAirforceName(String airforceName) {
        this.airforceName = airforceName;
    }

    public void setNavyName(String navyName) {
        this.navyName = navyName;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    /**
     * Displays all statistics of the nation or country.
     *
     * @return Statistics of the nation or country.
     */
    @Override
    public String stats() {
        return null;
    }

    /**
     * Displays all commands available for the nation.
     *
     * @return All available commands of the nation.
     */
    @Override
    public String help() {
        return null;
    }

    /**
     * Updates the statistics of the nation.
     */
    @Override
    public void update() {

    }

    /**
     * This Method displays all cities within the nation and options for all of them.
     *
     * @return All cities in the nation and the commands for them.
     */
    @Override
    public String cities() {
        return null;
    }

    /**
     * Displays the resource options of the nation.
     *
     * @return The resource option of the nation.
     */
    @Override
    public String resource() {
        return null;
    }

    /**
     * Displays the military and all choices for them.
     *
     * @return The military and the commands for them.
     */
    @Override
    public String military() {
        return null;
    }

    /**
     * Displays the menu to customize the government.
     *
     * @return Menu to customize the government.
     */
    @Override
    public String government() {
        return null;
    }

    /**
     * Displays the diplomatic menu.
     *
     * @return Menu for diplomacy.
     */
    @Override
    public String diplomacy() {
        return null;
    }

    /**
     * Displays personalised options for the nation.
     *
     * @return Personalised options for the nation.
     */
    @Override
    public String personalisation() {
        return null;
    }

    /**
     * Displays the settings option for the nation.
     *
     * @return The settings option for the nation.
     */
    @Override
    public String settings() {
        return null;
    }

    /**
     * Displays the menu with the economic commands for the nation.
     *
     * @return The economic commands for the nation.
     */
    @Override
    public String economy() {
        StringBuilder out = new StringBuilder();
        return null;
    }
}
